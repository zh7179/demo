package com.heng.fanxing;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 这是泛型的练习包
 * @author Administrator
 *
 */
public class FanXing {
	
	
	/**
	 * 1.泛型只在编译阶段有效;在编译之后程序会采取去泛型化的措施。也就是说Java中的泛型，
	 * 只在编译阶段有效。在编译过程中，正确检验泛型结果后，会将泛型的相关信息擦出，
	 * 并且在对象进入和离开方法的边界处添加类型检查和类型转换的方法。
	 * 也就是说，泛型信息不会进入到运行时阶段。
	 */
	@Test
	public void test01(){
		List<String> listString=new ArrayList<String>();
		List<Integer> listInteger=new ArrayList<Integer>();
		Class class1 = listInteger.getClass();
		Class class2 = listString.getClass();
		System.out.println(class1.equals(class2));  //true
	}
	
	@Test
	public void test02(){
		
	}
	
	@Test
	public void test03(){
		
	}

	
}

class Commit<T>{
	Commit(){}
	Commit(T var){
		System.out.println(var);
	}
	public T username;
	public T password;
	
	public T getUsername() {
		return username;
	}
	public void setUsername(T username) {
		this.username = username;
	}
	public T getPassword() {
		return password;
	}
	public void setPassword(T password) {
		this.password = password;
	}	
}



