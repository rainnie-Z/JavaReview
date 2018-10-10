package com.rainnie.exer;
/**
 * @功能:定义两个数组，分别输出两个数组各自的数组名及元素值。
 *       然后给每个数组的元素重新赋值，再次分别输出两个数组各自的数组名及元素值。
 * @author Rainnie
 *@时间:2018/7/10
 */
public class ArrayTest02 {
	  public static void main(String[] args) {
		  int[] arr=new int[2];
		  int[] arr2=new int[3];
		  
		  System.out.println(arr);
		  System.out.println(arr[0]);
		  System.out.println(arr[1]);
		  System.out.println("------------");
		  
		  System.out.println(arr2);
		  System.out.println(arr2[0]);
		  System.out.println(arr2[1]);
		  System.out.println(arr2[2]);
		  System.out.println("----");
		  
		  arr[1]=20;
		  
		  arr2[1]=30;
		  arr2[0]=40;
		  
		  System.out.println(arr);
		  System.out.println(arr[0]);
		  System.out.println(arr[1]);
		  System.out.println("----");
			
		  System.out.println(arr2);
		  System.out.println(arr2[0]);
		  System.out.println(arr2[1]);
		  System.out.println(arr2[2]);
		  
	}
	 
	 

}
