package com.rainnie.exer2;

public class InnerTest {
	public static void main(String[] args) {
		A2 o=new A2();
		o.ma();
		 
	}
}
class A2{
	private int s;
	public class B{
		public void mb() {
			s=100;
			System.out.println("在内部类B中s="+s);
		}
	}
	public void ma() {
		B i=new B();
		i.mb();
	}
}