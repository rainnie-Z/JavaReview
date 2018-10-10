package com.rainnie.exer;

import java.util.Scanner;

/**
 * @功能:键盘输入一个四位数（如:1234,个十百千位不重复）,要求把你输入的输入的这个四位数，反向打印(如4321)
 * @author Rainnie
 * @时间:2017/7/9
 *
 */
public class ReverseTest {
	public static void main(String[] args) {
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数字:");
		n=input.nextInt();
		System.out.println(reverse(n));
	}
	public static int reverse(int num) {
		int i,j=0;
		i=num;
		while(i!=0) {
			j=j*10+i%10; //取出最低位上的数字 ,依次得到反转的数字
			i=i/10;//降位
			//System.out.println(j);
		}
		return j;
	}
}
