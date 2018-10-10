package com.rainnie.myself3;
/*
 * abstract不能和哪些关键字共存?
	private	冲突
	final	冲突	
	static	无意义
 */
public class AbstractDemo2 {
	public static void main(String[] args) {
		Animal4 a=new Dog4();
		a.num=100;
		//a.num2=200;
		System.out.println(a.num);
		System.out.println(a.num2);
		a.show();
		a.method();
		
	}
}
abstract class Animal4{
	public int num=10;
	public final int num2=20;
	public Animal4() {}
    public Animal4(String name,int age) {}
    public abstract void show();
    public void method() {
    	System.out.println("method");
    }
}
class Dog4 extends Animal4{
	public void show() {
		System.out.println("show Dog");
	}
}
