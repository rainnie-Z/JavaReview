package com.rainnie.myself2;

public class AnimalExtendTest {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.setName("Tom");
		c1.setAge(3);
		c1.setColor("白色");
		System.out.println("猫的名字是："+c1.getName()+";年龄是："+c1.getAge()+";颜色是："+c1.getColor());
		c1.eat();
		c1.playGame();
		System.out.println("---------------");
		
		//方式2
		Cat c2 = new Cat("杰瑞",5,"土豪金");
		System.out.println("猫的名字是："+c2.getName()+";年龄是："+c2.getAge()+";颜色是："+c2.getColor());
		c2.eat();
		c2.playGame();
	}
}
class Animal{
	private String name;
	private int age;
	private String color;
	
	public Animal() {}
	public Animal(String name,int age,String color) {
		this.name=name;
		this.age=age;
		this.color=color;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void eat() {
		System.out.println("动物是要吃饭的");
	}
}

class Cat extends Animal{

	public Cat() {
	}

	public Cat(String name, int age, String color) {
		super(name, age, color);
	}
	public void playGame() {
		System.out.println("猫玩英雄联盟");
	}
	
}
class Dog4 extends Animal{

	public Dog4() {
		
	}
	public Dog4(String name, int age, String color) {
		super(name, age, color);
	}
	public void lookDoor() {
		System.out.println("狗要看家");
	}
	
}
