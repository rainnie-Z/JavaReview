package com.rainnie.myself;
/*
 * 九九乘法表
 */
public class JiuJiuTest {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}