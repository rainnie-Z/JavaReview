package com.rainnie.exer2;

public class PrivateDemo {
	public static void main(String[] args) {
		Student2 s=new Student2();
		s.show();
		System.out.println("-----------------");
		s.name="Rainnie";
		//s.age=20 私有不能访问
		s.setAge(20);
		s.show();
		System.out.println("----------------");
		s.setAge(-9);
		s.show();
	}
}
class Student2{
	String name;
	private int age;
	public void setAge(int a) {
		if(a < 0 || age > 120) {
			System.out.println("你给的年龄有问题");
		}else {
			age = a;
		}
	}
	public void show() {
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
	}
}
