package com.rainnie.exer2;

public class InnerTest2 {
	public static void main(String[] args) {
		A3 a=new A3();
		A3.B3 b=a.new B3();
		b.mb(333);
	}
}
class A3{
	private int s=111;
	public class B3{
		private int s=222;
		public void mb(int s) {
			System.out.println(s);
			System.out.println(this.s);
			System.out.println(A3.this.s);
		}
	}
}
