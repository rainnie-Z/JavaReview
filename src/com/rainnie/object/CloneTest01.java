package com.rainnie.object;

public class CloneTest01 {
	public static void main(String[] args) {
		Person4 p1=new Person4("Tom",18);
		Person4 p2=(Person4) p1.clone();
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		p2.setAge(34);
		p1.display();
		p2.display();
		
	}
	
}
class Person4 implements Cloneable{
	private String name;
	private int age;
	public Person4(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void display() {
		System.out.println("Name:"+name+"\tAge:"+age);
	}
	public Object clone() {
		Person4 p=null;
		try {
			p=(Person4)super.clone();
			
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
	
}
