package com.rainnie.homework2;
/**
 * @功能:创建一个整形数组a,数组的长度是50，通过循环赋值，
               是数组的值分别是3,7,11,15…，一共50个数。
               显示出每个数组元素的值和数组中所有元素之和
 * @author Rainnie
 * @时间:2018/7/10
 */
public class ArrayTest {
	public static void main(String[] args) {
		int[] arr=new int[50];
		for(int i=0,j=3;i<arr.length;i++,j+=4) {
			 arr[i]=j;
		}
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count++;
			sum+=arr[i];
			System.out.print(arr[i]+" ");
			if(count%5==0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("这些数的和是:"+sum);
	}
}
