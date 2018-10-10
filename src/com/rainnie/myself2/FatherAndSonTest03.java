package com.rainnie.myself2;
/*
 * 子类中所有的构造方法默认都会访问父类中空参数的构造方法
 * 因为子类会继承父类中的数据，可能还会使用父类的数据。
 * 所以，子类初始化之前，一定要先完成父类数据的初始化。
 * 子类每一个构造方法的第一条语句默认都是：super();
 * 
 * 如果父类没有无参构造方法，那么子类的构造方法会出现报错
 * 解决方案；A:在父类中加一个无参构造方法
		B:通过使用super关键字去显示的调用父类的带参构造方法
		C:子类通过this去调用本类的其他构造方法
		      子类中一定要有一个去访问了父类的构造方法，否则父类数据就没有初始化。
 */
public class FatherAndSonTest03 {
	public static void main(String[] args) {
		Son3 s=new Son3();
		System.out.println("-----------------");
		Son3 s2=new Son3("Rainnie");
	}
}
class Father3{
	int age;
	public Father3() {
		System.out.println("Father的无参构造方法");
	}
	public Father3(String name) {
		System.out.println("Father的带参构造方法");
	}
}
class Son3 extends Father3{
	public Son3() {
		//super();
		System.out.println("Son的无参构造方法");
	}
	public Son3(String name) {
		//super();
		System.out.println("Son的带参构造方法");
	}
}
