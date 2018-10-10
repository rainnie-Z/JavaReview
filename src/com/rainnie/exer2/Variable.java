package com.rainnie.exer2;

public class Variable {
	int num;
	int num2=10;
	public void show() {
		int num3;
		int num4=20;
		System.out.println(num);
		System.out.println(num2);
		//System.out.println(num3);错误，局部变量必须初始化
		System.out.println(num4);
	}
}
