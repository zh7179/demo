package com.heng.comparable;

import java.io.Serializable;

 /**
 * 测试用的实体类 书, 实现了 Comparable 接口，自然排序
 * 
 * @author Administrator
 *
 */
public class Book implements Comparable<Book>,Serializable {
	private String name;//书名
	private int price;//价格
		
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Book() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	/*
	 * 比较两个对象是否是用一种类型,并且对应的属性也应该相同
	 */
	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;   //判断是否指向同一个对象
		if(!(obj instanceof Book)) return false;//判断是不是相同的类型
		Book book=(Book) obj;
		if(getPrice()!=book.getPrice()) return false; //比较对象中的属性对应的值是否相同
		return getName().equals(book.getName());
	}
	
	/* 
	 * 重写 hashCode 的计算方法
     * 根据所有属性进行 迭代计算，避免重复
     * 计算 hashCode 时 计算因子 31 见得很多，是一个质数，不能再被除
	 */
	@Override
	public int hashCode() {
		//调用 String 的 hashCode(), 唯一表示一个字符串内容
		int result= getName().hashCode();
		//乘以 31, 再加上 count
		result= 31 * result + getPrice();
		return result;
	}
	
	/* 
	 * 当向 TreeSet 中添加 BookBean 时，会调用这个方法进行排序
	 * 按照书的价格进行排序,价格相同在按书名排序
	 */
	@Override
	public int compareTo(Book o) {
		//1.按照书的价格进行排序
		int result;
		result= this.getPrice()-o.getPrice();
		if(result==0){  //价格相同在按书名排序
			result=this.getName().compareTo(o.getName());
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}

}
