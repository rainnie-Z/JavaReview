package com.rainnie.exer2;
/*
 * 成员变量与局部变量的不同:类的位置；内存的位置；生命周期；初始化；
 */
public class VariableTest {
	public static void main(String[] args) {
		Variable v=new Variable();
		System.out.println(v.num);
		System.out.println(v.num2);
		v.show();
	}
}
