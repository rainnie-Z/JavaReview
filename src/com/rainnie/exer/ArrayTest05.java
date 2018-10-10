package com.rainnie.exer;

 

/**
 * @功能：数组逆序
 * @author Rainnie
 *@时间:2018/7/10
 */
public class ArrayTest05 {
	public static void main(String[] args) {
		int[] arr= {12,3,78,65,1};
		System.out.print("逆序前:");
		printArray(arr);
		reverse(arr);
		System.out.print("反转后:");
		printArray(arr);
		System.out.print("再次反转后:");
		reverse2(arr);
		printArray(arr);
		
	}
   /*
    * 打印数组
    */
	private static void printArray(int[] arr) {
		System.out.print("[");
		 for(int i=0;i<arr.length;i++) {
			 if(i==arr.length-1) {
				 System.out.print(arr[i]+"]");
			 }else {
				 System.out.print(arr[i]+",");
			 }
		 }
		 System.out.println();
		
	}
   /*
    * 反序
    */
	private static void reverse(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
		}
		
	}
	/*
	 * 反序
	 */
	private static void reverse2(int[] arr) {
		for(int start=0,end=arr.length-1;start<=end;start++,end--) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
		
	}
}
