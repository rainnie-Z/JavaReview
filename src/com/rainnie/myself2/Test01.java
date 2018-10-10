package com.rainnie.myself2;

public class Test01 {
	public static void main(String[] args) {
		Tool t=new Tool();
		Student2 s=new Student2();
		t.distribute(s);
	}
}
class Person{}
class Student2 extends Person{}
class Graduate extends Student2{}
class Tool{
	public void distribute(Person p) {
		if(p instanceof Person) {
			//Graduate g=(Graduate)p;
			System.out.println("处理Graduate类型及其子类类型");
		}else if(p instanceof Student2) {
			System.out.println("处理Student类型及其子类类型对象");
		}else {
			System.out.println("处理Peron类型及其子类类型对象");
		}
	}
}
