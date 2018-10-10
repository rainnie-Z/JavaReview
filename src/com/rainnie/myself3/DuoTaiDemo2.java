package com.rainnie.myself3;

public class DuoTaiDemo2 {
	public static void main(String[] args) {
		//定义为狗
		Animal a=new Dog();
		a.eat();
		System.out.println("-------------");
		//还原成狗
		Dog d=(Dog)a;
		d.eat();
		d.lookdoor();
		System.out.println("-------------");
		//变成猫
		a=new Cat();
		a.eat();
		System.out.println("-------------");
		//还原成猫
		Cat c=(Cat)a;
		c.eat();
		c.hunter();
		System.out.println("-------------");
		
		
		//演示错误的内容
		//Dog dd = new Animal();
		//Dog ddd = new Cat();
		//ClassCastException
	}
}
class Animal{
	public void eat() {
		System.out.println("动物要吃东西");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("狗吃肉");
	}
	public void lookdoor() {
		System.out.println("狗还会看家");
	}
}
class Cat extends Animal{
	public void eat() {
		System.out.println("猫吃鱼");
	}
	public void hunter() {
		System.out.println("猫还会抓老鼠");
	}
}
