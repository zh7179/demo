package com.heng.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class BookTest {
	
	@Test
	public void test02(){
		List<Person> list=new ArrayList<Person>();
		Person person1=new Person("上海",12);
		Person person2=new Person("北京",20);
		Person person3=new Person("南京",20);
		Person person4=new Person("杭州",10);
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		Collections.sort(list,new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if(o1==null || o2==null) return 0;
				int result;
				result=o1.getAge()-o2.getAge(); 
				if(result==0){  //年龄相同,比较名字
					result=o1.getName().compareTo(o2.getName());
				}
				return result;
			}
		});
		System.out.println(list);
	
	}
	
	@Test
	public void test01(){
		List<Book> list=new ArrayList<Book>();
		Book book1=new Book("java", 13);
		Book book2=new Book("java1", 12);
		Book book3=new Book("java", 14);
		Book book4=new Book("java", 12);
		Book book5=new Book("java", 11);
		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		list.add(book5);
		Collections.sort(list);
		System.out.println(list);
	}

}
