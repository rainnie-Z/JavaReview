package com.rainnie.jdk5news;
/*
 * 可变参数：定义方法的时候不知道该定义多少个参数
 * 格式：
 * 		修饰符 返回值类型 方法名(数据类型…  变量名){
 * 
 * 		}
 * 
 * 		注意：
 * 			这里的变量其实是一个数组
 * 			如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
 */	
public class ChangeArgsTest01 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int result=sum(a,b);
		System.out.println("result:" + result);
		
		int c = 30;
		result = sum(a, b, c);
		System.out.println("result:" + result);
		
		int d = 30;
		result = sum(a, b, c, d);
		System.out.println("result:" + result);
		
		result = sum(a, b, c, d, 40);
		System.out.println("result:" + result);


	}

	private static int sum(int...a) {
		 int s=0;
		 for(int x:a) {
			 s+=x;
		 }
		 return s;
	}
}
