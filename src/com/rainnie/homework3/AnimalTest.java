package com.rainnie.homework3;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a=new Dog("旺财",4);
		Dog d=(Dog)a;
		d.call();
		Animal aa=new Chicken("阿花",2);
		Chicken c=(Chicken)aa;
		c.catchWorm();
		System.out.println("-----------");
		d.walk(4);
		c.walk(2);
		 
		
	    
		
	}
}
class Animal{
	String name;
	int leg;
	public  Animal() {
	}
	public  Animal(String name, int leg) {
		this.name = name;
		this.leg = leg;
	}
	
	public void walk() {
		System.out.println("动物会走路");
	}
}
class Chicken extends Animal{

	public Chicken() {
		super();
	}

	public Chicken(String name, int leg) {
		super(name, leg);	 
	}
	public void walk(int leg) {
		System.out.println("阿花用"+leg+"只腿奔跑");
	}
	public void catchWorm() {
		System.out.println("阿花在田里捉蟋蟀");
	}
	
}
class Dog extends Animal{

	public Dog() {
		super();
	}

	public Dog(String name, int leg) {
		super(name, leg);
	}
	public void walk(int leg) {
		
		System.out.println("旺财用"+leg+"只腿奔跑");
	}
	public void call() {
		System.out.println("汪汪汪");
	}
	
}
