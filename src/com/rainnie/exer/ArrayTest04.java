package com.rainnie.exer;
/**
 * @功能:数组获取最值(获取数组中的最大值最小值)
 * @author Rainnie
 *@时间:2018/7/10
 */
public class ArrayTest04 {
	public static void main(String[] args) {
		int[] arr= {43,34,2,61,23};
		/*
		 * 主函数直接定义求
		 */
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			 if(max<arr[i]) {
				 max=arr[i];
			 }
		}
		System.out.println("max："+max);
		System.out.println(getMax(arr));
		System.out.println(getMin(arr));
		 
	}
	/*
	 * 求数组最小值
	 */
	private static int getMin(int[] arr) {
		int min=arr[0];
		 for(int i=0;i<arr.length;i++) {
			 if(min>arr[i]) {
				 min=arr[i];
			 }
		 }
		return min;
		
	}
    /*
     * 求数组最大值
     */
	private static int getMax(int[] arr) {
		int max=arr[0];
		 for(int i=0;i<arr.length;i++) {
			 if(max<arr[i]) {
				 max=arr[i];
			 }
		 }
		return max;
		
	}
}
