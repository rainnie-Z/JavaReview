package com.rainnie.myself2;
/*
 * 相比CodeDemo,多一条:子类初始化之前先会进行父类的初始化
 */
public class CodeDemo2 {
	public static void main(String[] args) {
		Zi z=new Zi();	
	}
}
class Fu{
	static {
		System.out.println("静态代码块fu");
	}
	{
		System.out.println("构造代码块fu");
	}
	public Fu(){
		System.out.println("构造方法fu");
	}
}
class Zi extends Fu{
	static {
		System.out.println("静态代码块zi");
	}
	{
		System.out.println("构造代码块zi");
	}
	public Zi(){
		System.out.println("构造方法zi");
	}
}
