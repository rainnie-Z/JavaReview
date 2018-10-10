package com.rainnie.exer;
/**
 * @功能:数组的静态初始化：
		格式：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…};
		简化格式：
			数据类型[] 数组名 = {元素1,元素2,…};
 * @author Rainnie
 *@时间:2018/7/10
 */
public class ArrayTest03 {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		System.out.println(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//ArrayIndexOutOfBoundsException:数组索引越界异常
		   //  原因：你访问了不存在的索引
		//System.out.println(arr[3]);
		//NullPointerException:空指针异常
		//     原因：数组已经不在指向堆内存了。而你还用数组名去访问元素。
		//arr=null;
		//System.out.println(arr[0]);
		PrintArray(arr);
	}

	private static void PrintArray(int[] arr) {
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
