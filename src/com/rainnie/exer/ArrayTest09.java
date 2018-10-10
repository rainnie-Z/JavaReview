package com.rainnie.exer;

import java.util.Arrays;

/**
 * @功能:数组复制  数组排序
 * @author Rainnie
 * @时间:2018/7/10
 */
public class ArrayTest09 {
	public static void main(String[] args) {
		int[] source= {1,2,3,4,5,6};
		int[] dest= {10,9,8,7,6,5,4,3,2,1};
	    System.arraycopy(source, 0, dest, 0, 3);
	    for(int i:dest) {
	    	System.out.print(i+" ");
	    }
	    System.out.println();
	    System.out.println("-------------------");
	    int[] arr= {6,12,-56,89,34};
	    Arrays.sort(arr);
	    for(int i:arr) {
	    	System.out.print(i+" ");//升序
	    }
	}
}
