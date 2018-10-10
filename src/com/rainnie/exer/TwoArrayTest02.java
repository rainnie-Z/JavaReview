package com.rainnie.exer;
/**
 * @功能:实现二维数组的遍历
 * @author Rainnie
 * @时间:2018/7/10
 */
public class TwoArrayTest02 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		printArray2(arr);
	}

	private static void printArray2(int[][] arr) {
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[i].length;j++) {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
		
	}
}
