package com.rainnie.thetest;

import java.util.Scanner;
/*
 * @功能:对A类中的成员变量v进行猜测，并对猜测的结果进行反馈.
 * @开发者：Rainnie
 * @时间：2018/7/21
 */
public class NumberGuessTest {
	public static void main(String[] args) {
		A a=new A();
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入你猜的数字:");
			int number=sc.nextInt();
			if(number<a.getV()) {
				System.out.println("不对哦，你猜的数字小了");
			}else if(number>a.getV()) {
				System.out.println("不对哦，你猜的数字大了");
			}else {
				System.out.println("恭喜你，猜对了");
				break;
			}
		}
	}
}
class A{
	//初始化v值为100
	private int v=100;

	public int getV() {
		return v;
	}

	 
	
}
