package com.rainnie.exer;
/*
 * 自定义一维数组
 */
public class ArrayTest01 {
	public static void main(String[] args) {
		int[] s=new int[10];
		System.out.println(s);
		int count = 0;
		for(int i=0;i<s.length;i++) {
			s[i]=2*i+1;
			System.out.print(s[i]+" ");
			count++;
			if(count%5==0) {
				System.out.println();
			}
		}
		System.out.println(s);
		System.out.println(s[0]);
		System.out.println(s[5]);
	}
}
