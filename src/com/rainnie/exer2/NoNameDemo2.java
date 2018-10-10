package com.rainnie.exer2;

public class NoNameDemo2 {
	public static void main(String[] args) {
		Person sp=new Person("Rainnie",20) {

			@Override
			public void work() {
				 System.out.println("个人信息:"+this.getInfo());
				 System.out.println("I am sailing,I am sailing");
			}
			
		};
		sp.work();
	}
}
abstract class Person{
	private String name;
	private int age;
	public Person() {
		 
	}
	public Person(String name, int age) {
		 
		this.name = name;
		this.age = age;
	}
	public String getInfo() {
		return "Name:"+name+"\tAge:"+age;
	}
	public abstract void work();
}
