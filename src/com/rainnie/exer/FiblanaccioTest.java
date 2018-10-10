package com.rainnie.exer;

import java.util.Scanner;

/**
 * @功能:实现斐波那契，递归，0,1,1,2,3,5,8....
 * @author Rainnie
 *
 */
public class FiblanaccioTest {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("请输入一个数字:");
		 int num=sc.nextInt();
		 System.out.println(fib(num));
	}

	private static int fib(int num) {
		 if(num==1) {
			 return 0;
		 }else if(num==2) {
			 return 1;
		 }else {
			 return fib(num-1)+fib(num-2);
		 }
		 
	}
}
