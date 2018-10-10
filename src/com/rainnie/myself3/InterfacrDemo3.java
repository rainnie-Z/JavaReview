package com.rainnie.myself3;
/*
 * 猫狗案例加入额外的功能:跳高
 */
public class InterfacrDemo3 {
	public static void main(String[] args) {
		JumpCat jc=new JumpCat();
		jc.setName("哆啦A梦");
		jc.setAge(3);
		System.out.println(jc.getName()+"-"+jc.getAge());
		jc.eat();
		jc.sleep();
		jc.jump();
		jc.add();
		System.out.println("-----------------");
		
		JumpCat jc2=new JumpCat("星猫",2);
		System.out.println(jc2.getName()+"-"+jc2.getAge());
		jc2.eat();
		jc2.sleep();
		jc2.jump();
		
		System.out.println("-------");
		JumpDog jd2=new JumpDog("哮天犬",2000);
		System.out.println(jd2.getName()+"-"+jd2.getAge());
		jd2.eat();
		jd2.sleep();
		jd2.jump();
		jd2.add();
	}
}
interface Jumpping{
	public abstract void jump();
	public void add();
}
abstract class Animal7{
	private String name;
	private int age;
	public Animal7() { 
	}
	public Animal7(String name, int age) {
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
	public void sleep() {
		System.out.println("是动物就需要睡觉");
	}
	
}
class Cat7 extends Animal7{
	

	public Cat7() {
	}

	public Cat7(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
		
	}	 
	public void sleep() {
		System.out.println("猫睡觉");
	}
}
class Dog7 extends Animal7{
	
	public Dog7() {
		
	}

	public Dog7(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}
}
class JumpCat extends Cat7 implements Jumpping{
	
	public JumpCat() {
	}

	public JumpCat(String name, int age) {
		super(name, age);
	}

	@Override
	public void jump() {
		System.out.println("跳高猫");
		
	}

	@Override
	public void add() {
		System.out.println("add猫");
		
	}

	
}
class JumpDog extends Dog7 implements Jumpping{
	
	public JumpDog() {
		
	}

	public JumpDog(String name, int age) {
		super(name, age);
	}

	@Override
	public void jump() {
		System.out.println("跳高狗");
	}

	@Override
	public void add() {
		System.out.println("add狗");
		
	}

	
}
