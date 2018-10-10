package com.rainnie.io3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * System.in 标准输入流。是从键盘获取数据的
 * 
 * 键盘录入数据：
 * 		A:main方法的args接收参数。
 * 			java HelloWorld hello world java
 * 		B:Scanner(JDK5以后的)
 * 			Scanner sc = new Scanner(System.in);
 * 			String s = sc.nextLine();
 * 			int x = sc.nextInt()
 * 		C:通过字符缓冲流包装标准输入流实现
 * 			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 */
public class SystemInTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入一个字符串:");
		String line=br.readLine();
		System.out.println("你输入的字符串是:"+line);
		System.out.println("请输入一个整数：");
		line=br.readLine();
		int i=Integer.parseInt(line);
		System.out.println("你输入的整数是:"+i);
	}
}
