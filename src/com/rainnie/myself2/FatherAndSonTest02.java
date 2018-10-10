package com.rainnie.myself2;
/*
 * this代表本类对应的引用。
   super代表父类存储空间的标识(可以理解为父类引用,可以操作父类的成员
 */
public class FatherAndSonTest02 {
	public static void main(String[] args) {
		Son2 s=new Son2();
		/*Father2 f=new Son2();
		System.out.println(f.name);*/
		s.show();
		System.out.println("===================");
		 
	}
}
class Father2{
	
	public int num=10;
	public Father2() {
		System.out.println("fu");
	}
}
class Son2 extends Father2{
	public int num=20;
	 
	public Son2() {
		System.out.println("zi");
	}
	public void show() {
		int num=30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}
