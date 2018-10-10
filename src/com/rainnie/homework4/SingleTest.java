package com.rainnie.homework4;



public class SingleTest {
	public static void main(String[] args) {
		Single s1 = Single.getIntance();
		s1.setName("name");
		showName();
	}

	public static void showName() {
		Single s2 = Single.getIntance();
		System.out.println(s2.getName());
		
	}
}
class Single{
	/*
	 * 饿汉式
	 */
	private String name;
	private static Single instance=new Single();
	public Single() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static Single getIntance() {
		return instance;
	}
	
}
class Single2{
	/*
	 * 懒汉式
	 */
	private String name;
	private static Single2 instance=null;
	public Single2() {
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public static Single2 getInstance() {
		if(instance==null) {
			instance=new Single2();
		}
		return instance;
	}
}
