package com.rainnie.exer;

import java.util.Scanner;

/**
 * @功能：打印杨辉三角
 * @author Rainnie
 * @时间:2018/7/10
 */
public class TwoArrayTest04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数:");
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<arr.length;i++) {
			arr[i][0]=1;
			arr[i][i]=1;
		}
		for(int i=2;i<arr.length;i++) {
			for(int j=1;j<=i-1;j++) {
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}
		/*for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();//这样会把没有数字的地方打印为0
		}*/
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
