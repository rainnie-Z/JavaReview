package com.rainnie.mytest;

public class TestDemo2 extends A{
	public static void main(String[] args) {
		A a=new TestDemo2();
		a.f();
		a.k();

	}

	@Override
	void f() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void k() {
		System.out.print("I am subclass");
		
	}
	
}
abstract class A{
 abstract void f();
public abstract void k();
}

