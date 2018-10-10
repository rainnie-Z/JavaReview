package com.rainnie.myself2;

public class FatherAndSonTest04 {
	public static void main(String[] args) {
		Son4 s=new Son4();
		s.show();
		s.method();
	}
}
class Father4{
	public void show() {
		System.out.println("show father");
	}
}
class Son4 extends Father4{
	public void method() {
		System.out.println("method son");
	}
	public void show() {
		System.out.println("show son");
	}
}