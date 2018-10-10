package com.rainnie.exer;

import java.util.Arrays;

/**
 * @功能:实现数组的排序
 * @author Rainnie
 * @时间:2018/7/10
 */
public class ArrayTest08 {
	public static void main(String[] args) {
		int[] arr= {12,2,34,78,56};
		int temp;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {//现在是升序，<号则是降序
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("[");
		 for(int i=0;i<arr.length;i++) {
			 if(i==arr.length-1) {
				 System.out.print(arr[i]+"]");
			 }else {
				 System.out.print(arr[i]+",");
			 }
		 }
	}
}
