package com.rainnie.myself3;
/*
 * A:成员变量
			编译看左边，运行看左边
		B:构造方法
			子类的构造都会默认访问父类构造
		C:成员方法
			编译看左边，运行看右边
		D:静态方法
			编译看左边，运行看左边
			
			
多态的弊端：
		不能使用子类的特有功能。
对象间的转型问题：
		向上转型：
			Fu f = new Zi();
		向下转型：
			Zi z = (Zi)f; //要求该f必须是能够转换为Zi的。
 */
public class DuoTaiDemo {
	public static void main(String[] args) {
		Fu2 f=new Zi2();
		System.out.println(f.num);
		System.out.println(f.num2);
		//找不到符号
		/*System.out.println(f.num2);*/
		f.show();
		f.function();
		f.add();
		//找不到符号
		/*f.method();*/
		Zi2 z=(Zi2)f;
		z.method();
		
		
	}
}

class Fu2{
	public int num=100;
	public static int num2=200;
	public void show() {
		System.out.println("fu show");
	}
	public void function() {
		System.out.println("fu function");
	}
	public static void  add() {
		System.out.println("fu add");
	}
	 
}
class Zi2 extends Fu2{
	public int num=1000;
	public int num2=2000;
	public void show() {
		System.out.println("zi show");
	}
	public void function() {
		System.out.println("zi function");
	}
	public void method() {
		System.out.println("zi method");
	}
	public static void add() {
		System.out.println("zi add");
	}
}
