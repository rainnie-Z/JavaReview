package com.rainnie.myself3;
/*
 * final:修饰类，类不能被继承
 *       修饰方法，方法不能被重写
 *       修饰变量，变量变为一个常量
 */
/*final修饰变量的初始化时机
A:被final修饰的变量只能赋值一次。
B:在构造方法完毕前。(非静态的常量)*/
public class FinalDemo {
	public static void main(String[] args) {
		Zi z=new Zi();
		z.show();
	}
}
/*final */class Fu{
	public int num=10;
	public final int num2=20;
	/*public final void show() {
		System.out.println();
	}*/
}
class Zi extends Fu{
	// Zi中的show()无法覆盖Fu中的show()
	public void show() {
		num=100;
		System.out.println(num);
		//num2=200;无法为最终变量num2分配值
		System.out.println(num2);
	}
}

