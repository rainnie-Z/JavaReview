package com.rainnie.thetest;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @功能：从键盘上输入10个整数，实现从大到小排序并输出
 * @开发者:Rainnie
 * @创建时间:2018/7/21
 */
public class SortTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array=new int[10];
		for(int i=0;i<array.length;i++) {
			System.out.println("请输入第"+(i+1)+"个整数:");
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		int count=0;
		for(int index=0;index<array.length;index++) {
			count++;
			System.out.print(array[index]+"  ");
			if(count==5) {
				System.out.println();
			}
			
		}
	}
}
