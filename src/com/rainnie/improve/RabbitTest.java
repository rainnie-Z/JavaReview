package com.rainnie.improve;
/**
 * @功能:有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月
 *       后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少
 * @开发者:Rainnie
 * @时间:2018/7/10      
 */
import java.util.Scanner;

public class RabbitTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入月数:");
		int n=sc.nextInt();
		System.out.println("第"+n+"个月的兔子数是"+fib(n));
	}
	private static int fib(int n) {
		if(n==1||n==2) {
			return 2;
		}else {
			return fib(n-1)+fib(n-2);
		}
		
	}
}
