package com.rainnie.exer;
/**
 * @功能:实现数组的元素查找并返回下标
 * @author Rainnie
 * @时间:2018/7/10
 */
public class ArrayTest07 {
	public static void main(String[] args) {
		int[] arr= {12,34,43,9,124};
		int index=getIndex(arr,12);
		System.out.println("12首次出现在"+index+"这个位置");
		
	}
   /*
    * 获取查找元素的下标
    */
	private static int getIndex(int[] arr, int value) {
		int index=-1;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==value) {
				 index=i;
				 break;
			 }
		 }
		return index;
	}
}
