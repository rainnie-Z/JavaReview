package com.rainnie.exer2;
/**
 * 匿名函数:仅仅只调用一次的时候;匿名对象调用完毕就是垃圾,可以被垃圾回收器回收;
 *          匿名对象可以作为实际参数传递
 * @author Rainnie
 *
 */
public class NoNameDemo {
	public static void main(String[] args) {
		//带名字的调用
		Student s=new Student();
		s.show();
		s.show();
		System.out.println("----------------");
		//匿名对象
		new Student();
		new Student().show();
		new Student().show();//这里其实是重新创建了一个新的对象
		System.out.println("-------------");
		StudentDemo sd=new StudentDemo();
		Student ss=new Student();
		sd.method(ss);//这里的s是一个实际参数
		sd.method(new Student());
		
		new StudentDemo().method(new Student());
	}
}
class Student{
	public void show() {
		System.out.println("我爱学习");
	}
}
class StudentDemo{
	public void method(Student s) {
		s.show();
	}
}
