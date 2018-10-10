package com.rainnie.myself3;
/*
 * final修饰局部变量:
 *    基本类型:基本类型的值不能发生改变。
 *    引用类型：引用类型的地址值不能发生改变，但是，该对象的堆内存的值是可以改变的。
 */
public class FinalDemo2 {
	public static void main(String[] args) {
		//局部变量是基本数据类型
		int x=10;
		x=100;
		System.out.println(x);
		final int y=10;
		//y=100;
		System.out.println(y);
		System.out.println("-----------------------");
		
		//局部变量是引用数据类型
		Student s=new Student();
		System.out.println(s.age);
		s.age=100;
		System.out.println(s.age);
		s=new Student();
		System.out.println("-------------------");
		
		final Student ss=new Student();
		System.out.println(ss.age);
		ss.age=100;
		
		//重新分配内存空间
				//无法为最终变量ss分配值
		//ss=new Student();
		System.out.println(ss.age);
	}
}
class Student{
	int age=10;
}
