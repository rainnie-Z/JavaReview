package com.rainnie.myself;

import java.util.Scanner;

/*
 * 水仙花数:153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
 */
public class NarcissusTest {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数:");
		int num=sc.nextInt();
		int a=num/100;
		int b=num%100/10;
		int c=num%10;
		System.out.println("a:"+a+",b:"+b+",c:"+c);
		if(a*a*a+b*b*b+c*c*c==num) {
			System.out.println("这个数是水仙花数");
		}else {
			System.out.println("这个数不是水仙花数");
		}*/
		int count=0;
		for(int i=100;i<=999;i++) {
			int a=i/100;
			int b=i%100/10;
			int c=i%10;
			if(a*a*a+b*b*b+c*c*c==i) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("总共有"+count+"个水仙花数");
	}
}
