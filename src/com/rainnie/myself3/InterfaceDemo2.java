package com.rainnie.myself3;
/*
 * 类与类:
 *    继承关系，只能单继承，可以多层继承
 * 类与接口：
 *    实现关系，可以单实现，可以多实现
 *    并且还可以在继承一个类的同时实现多个接口
 * 接口与接口；
 *   继承关系，可以单继承，也可以多继承
 */
public class InterfaceDemo2 {
	public static void main(String[] args) {
		Father f=new Son();
		f.show();
		//f.show2();错误
		Monther m=new Son();
		//m.show();错误
		m.show2();
		
		Son s=new Son();
		s.show();
		s.show2();
	}
}
interface Father{
	public abstract void show();
}
interface Monther{
	public abstract void show2();
}
//继承的同时还能多实现
class Son extends Object implements Father,Monther{
	@Override
	public void show() {
		System.out.println("show son");
	}
	@Override
	public void show2() {
		 System.out.println("show2 son");
		
	} 
}
