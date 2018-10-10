package com.rainnie.homework;
/**
 * @功能:输入一个数，得到该数的阶乘,使用递归和非递归
 * @author Rainnie
 */
import java.util.Scanner;

public class RecursionTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个正整数:");
		int num=sc.nextInt();
		System.out.println("非递归得到的数是:"+notdigui(num));
		System.out.println("递归得到的数是:"+digui(num));
	}
	/*
	 * 递归
	 */
	private static int digui(int num) {
		 if(num==1) {
			 return 1;
		 }
		 return num*digui(num-1);
		 
	}

	/*
	 * 非递归
	 */
	private static int notdigui(int num) {
		int temp=1;
		for(int i=1;i<=num;i++) {
			temp=temp*i;
		}
		
		return temp;
	}
}
