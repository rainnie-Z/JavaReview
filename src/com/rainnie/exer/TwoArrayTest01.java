package com.rainnie.exer;
/**
 * @功能:二维数组:数据类型[][] 数组名 = new 数据类型[m][n]
 *       m:表示这个二维数组有多少个一维数组。n:表示每一个一维数组的元素有多少个。
 *       列数没有给出，可以动态的给。这一次是一个变化的列数。
 * @author Rainnie
 * @时间:2018/7/10
 */
public class TwoArrayTest01 {
	public static void main(String[] args) {
		int[][] arr=new int[3][2];
		 //输出二维数组名称
		System.out.println(arr);//[[I@70dea4e
		 //输出二维数组的第一个元素一维数组的名称
		System.out.println(arr[0]);//[I@5c647e05
		System.out.println(arr[1]);//[I@33909752
		System.out.println(arr[2]);//[I@55f96302
		 //输出二维数组的元素
		System.out.println(arr[0][0]);//0
		System.out.println(arr[0][1]);//0
		System.out.println("----------------------------------------------");
		
		int[][] arr2 = new int[3][];
		
		System.out.println(arr2);//[[I@3d4eac69
		
		System.out.println(arr2[0]);//null;
		System.out.println(arr2[1]);//null;
		System.out.println(arr2[2]);//null;
		
		arr2[0] = new int[2]; 
		arr2[1] = new int[3]; 
		arr2[2] = new int[1]; 
		
		System.out.println(arr2[0]);//[I@42a57993
		System.out.println(arr2[1]);//[I@75b84c92
		System.out.println(arr2[2]);//[I@6bc7c054
		
		System.out.println(arr2[0][0]);//0
		System.out.println("---------------------------------------------");
		
		int[][] arr3= {{1,2,3},{4,5},{6}};
		System.out.println(arr3[0][0]); //1
		System.out.println(arr3[1][0]); //4
		System.out.println(arr3[2][0]); //6
		
		System.out.println(arr3[0][1]); //2
		System.out.println(arr3[1][1]); //5
		
		
	}
}
