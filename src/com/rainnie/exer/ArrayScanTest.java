package com.rainnie.exer;
/**
 * @功能:键盘输入3个字符，存放到对应的数组。
 *       要求:把数组中的3个字符升序排列显示出来。
 * @开发者:Rainnie
 * @创建时间:2018/07/10
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanTest {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("输入值:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int[] arr= {num1,num2,num3};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}*/
		char[] inchar=new char[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<inchar.length;i++) {
			System.out.println("请输入第"+(i+1)+"个字符");
			//通过循环给字符型数组元素赋值
			inchar[i]=sc.next().charAt(0);//字符串(只含有一个字符)转换成字符，可以使用chatAt(0)方法
		}
		Arrays.sort(inchar);
		for(char c:inchar) {
			System.out.print(c+" ");
		}
		 
	}
}
