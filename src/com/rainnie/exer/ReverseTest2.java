package com.rainnie.exer;

import java.util.Scanner;

public class ReverseTest2 {
	public static void main(String[] args) {
		String grade;
		Scanner sc=new Scanner(System.in);
		System.out.println("输入成绩:");
		int score=sc.nextInt();
		if(score>=90&&score<=100) {
			grade="成绩优秀";
		}else if(score>=80&&score<90) {
			grade="成绩良好";
		}else if(score>=60&&score<80) {
			grade="成绩及格";
		}else if(score>=0&&score<60) {
			grade="成绩不及格";
		}else {
			grade="输入错误";
		}
		System.out.println(grade);
	}
}
