package com.rainnie.exer;

import java.util.Scanner;

/**
 * @功能:键盘输入一个学生的成绩，有提示性信息, 
 *       如果成绩大于等于90分并且小于等于100分时，显示成绩优秀,
 *       成绩大于等于80分时，显示成绩良好
 *       成绩大于等于60分时，显示成绩及格
 *       成绩小于60分并且大于等于0分时，显示成绩不及格
 *       其他的情况下，显示成绩输入错误.
 *      要求：使用条件运算符（？：）实现

 * @author Rainnie
 * @时间：2018/7/9
 */
public class ScoreTest {
	public static void main(String[] args) {
		int score;
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入成绩:");
		score=scan.nextInt();
		String output=(score>100)?"成绩输入错误":(score>=90?"成绩优秀":(score>=80?"成绩良好":(score>=60?"成绩及格":(score>=0?"成绩不及格":"成绩输入错误"))));	
		System.out.println(output);
		 
	}

	 
}
