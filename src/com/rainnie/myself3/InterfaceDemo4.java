package com.rainnie.myself3;

public class InterfaceDemo4 {
	public static void main(String[] args) {
		PingPangPlayer ppp=new PingPangPlayer();
		ppp.setName("张继科");
		ppp.setAge(30);
		ppp.sleep();
		ppp.eat();
		ppp.study();
		ppp.speak();
		System.out.println("-------------");
		BasketPlayer bp=new BasketPlayer("姚明",35);
		bp.sleep();
		bp.eat();
		bp.study();
		//bp.speak();
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
	public void sleep() {
		System.out.println("是人都要睡觉");
	}
	public abstract void eat();
	
}
abstract class Player extends Person{

	public Player() {
	}

	public Player(String name, int age) {
		super(name, age);
	}
	public abstract void study();
}
abstract class Coach extends Person{

	public Coach() {
	}

	public Coach(String name, int age) {
		super(name, age);
	}
	public abstract void teach();
}
interface SpeakEnglish{
	public abstract void speak();
}
class PingPangPlayer extends Player implements SpeakEnglish{
	
	public PingPangPlayer() {
		 
	}

	public PingPangPlayer(String name, int age) {
		super(name, age);
	}

	@Override
	public void speak() {
		System.out.println("乒乓球运动员要会说英语");
	}

	@Override
	public void study() {
		System.out.println("乒乓球运动员会打球");
		
	}

	@Override
	public void eat() {
		 System.out.println("乒乓球运动员要吃饭");
		
	}
	
}
class PingPangCoach extends Coach implements SpeakEnglish{
	
	public PingPangCoach() {
	}

	public PingPangCoach(String name, int age) {
		super(name, age);
	}

	@Override
	public void speak() {
		System.out.println("乒乓球教练要会说英语");
		
	}


	@Override
	public void eat() {
		 System.out.println("乒乓球教练要吃饭");
		
	}

	@Override
	public void teach() {
		System.out.println("乒乓球教练会教球");
		
	}
	
}
class BasketPlayer extends Player{
	
	public BasketPlayer() {
		 
	}

	public BasketPlayer(String name, int age) {
		super(name, age);
	}

	@Override
	public void study() {
		System.out.println("篮球运动员会打篮球");
		
	}

	@Override
	public void eat() {
		System.out.println("篮球运动员要吃饭");
		
	}
	
}
class BasketCoach extends Coach{
	
	public BasketCoach() {
	}

	public BasketCoach(String name, int age) {
		super(name, age);
	 
	}

	@Override
	public void teach() {
		System.out.println("篮球教练会教篮球");
		
	}

	@Override
	public void eat() {
		System.out.println("篮球教练要吃饭");
		
	}
	
}
