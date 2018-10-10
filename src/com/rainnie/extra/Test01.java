package com.rainnie.extra;
/*
 * i++是先把i的值拿来用,然后在自增1
 * ++i是想把i自增1然后拿来用
 */
public class Test01 {
	public static void main(String[] args) {
		float f1 = 12.345f;
		float f2 = (float)12.345;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1==f2);
		int a = 10;
		int b = ++a;
		int a1=10;
		int b1=a1++;
		System.out.println(a+"-"+b+"-"+a1+"-"+b1);
	}
}
