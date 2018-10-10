package com.rainnie.myself3;

public class AbstractDemo3 {
	public static void main(String[] args) {
		Dog5 d=new Dog5();
		d.setName("阿旺");
		d.setAge(3);
		System.out.println(d.getName()+"---"+d.getAge());
		d.eat();
		System.out.println("--------------------");
		Dog5 d2=new Dog5("小阿旺",2);
		System.out.println(d2.getName()+"-"+d2.getAge());
		d2.eat();
		System.out.println("====================");
		
		Animal5 a=new Dog5();
		a.setName("旺财");
		a.setAge(4);
		System.out.println(a.getName()+"--"+a.getAge());
		a.eat();
		
		Animal5 a2=new Dog5("小旺财",3);
		System.out.println(a2.getName()+"---"+a2.getAge());
		a.eat();
		
		
	}
}
abstract class Animal5{
	private String name;
	private int age;
	public Animal5() {
		 
	}
	public Animal5(String name, int age) {
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
	public abstract void eat();
	
	
}
class Dog5 extends Animal5{
	
	public Dog5() {
	}

	public Dog5(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("狗吃肉"); 
		
	}
	
}
class Cat5 extends Animal5{
	
	public Cat5() {
	}

	public Cat5(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		 System.out.println("猫吃鱼");
		
	}
	
}
