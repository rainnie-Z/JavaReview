package com.rainnie.myself3;

public class DuoTaiTest3 {
	public static void main(String[] args) {
		A a=new B();
		a.show();
		
		B b=new C();
		b.show();
	}
}
class A{
	public void show() {
		show2();
	}
	public void show2() {
		System.out.println("我");
	}
	/*public void show3() {
		System.out.println("kkk");
	}*/
}
class B extends A{
	/*public void show() {
		show2();
	}*/
	public void show2() {
		System.out.println("爱");
	}
}
class C extends B{
	public void show() {
		super.show();
	}
	public void show2() {
		System.out.println("你");
	}
}