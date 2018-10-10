package com.rainnie.exer;
/*
 * i++是先把i的值拿来用,然后在自增1
 * ++i是想把i自增1然后拿来用
 */
public class Test01 {
	public static void main(String[] args) {
		int a =2; 
		int b= (a ++)+ 3 * a;
		System.out.println(a);
		System.out.println(b);
		int a1 =2;
		int b1= a1 + 3 * a1++;
		System.out.println(a1);
		System.out.println(b1);
	}
}
