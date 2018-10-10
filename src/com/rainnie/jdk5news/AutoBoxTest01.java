package com.rainnie.jdk5news;

public class AutoBoxTest01 {
	public static void main(String[] args) {
		Integer a=new Integer(3);
		Integer aa=3;
		Integer b=3;//将3自动装箱成Integer类型
		int c=3;
		System.out.println(a==b); 
		System.out.println(aa==b);
		System.out.println(a==c);//自动拆箱成int类型再和c比较
		System.out.println("-----------------------------");
		Integer f1=100,f2=100,f3=150,f4=150;
		System.out.println(f1==f2);
		System.out.println(f3==f4);
		/*
		 * 注意：在-128-127，会有一个常量池，在此中取值，不会new一个新的Integer对象
		 */
	}
}
