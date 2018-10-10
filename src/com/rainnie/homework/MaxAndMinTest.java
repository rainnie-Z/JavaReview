package com.rainnie.homework;
/**
 * @功能：计算并显示三个数（562,1256,-89）中的最大数，最小数。
                  要求:1) 定义计算最大值的方法max()，算出3个数中的最大值
                2) 定义计算最小值的方法min(), 算出3个数中的最小值
 * @author Rainnie
 * @时间:2018/7/9
 *
 */
public class MaxAndMinTest {
	public static void main(String[] args) {
		System.out.println("（562,1256,-89）中的最大数是:"+max(562,1256,-89));
		System.out.println("（562,1256,-89）中的最小数是:"+min(562,1256,-89));
	}
	/*
	 * 定义计算最大值的方法max()，算出3个数中的最大值
	 */
	private static int max(int i, int j, int k) {
		int result=(i>j?(i>k?i:k):j);
		return result;
		
	}
	/*
	 * 定义计算最小值的方法min(), 算出3个数中的最小值
	 */
	private static int min(int i, int j, int k) {
		 if(i>j) {
			 if(j>k) {
				 return k;
			 }else {
				 return j;
			 }
		 }else {
			 if(i>k) {
				 return k;
			 }else {
				 return i;
			 }
		 }
		
	}
}
