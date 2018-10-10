package com.rainnie.homework5;

import java.util.Scanner;

/**
 * 
 * @author Rainnie
 *
 */
public class Person {
	String name="匿名";//名字
	int score=0;//积分
	/**
	 * 
	 * @return 出拳结果：1.剪刀 2.石头 3.布
	 */
	public int showFist() {
		//接受用户的选择
		Scanner sc=new Scanner(System.in);
		System.out.println("\n请出拳:1.剪刀 2.石头 3.布 (输入相应数字) :");
		int show=sc.nextInt();
		switch(show) {
		case 1:
			System.out.println("你出拳:剪刀");
			break;
		case 2:
			System.out.println("你出拳:石头");
		case 3:
			System.out.println("你出拳:布");
		}
		return show;
		
	}
}
