package com.rainnie.io3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

/*
 * 标准输入输出流
 * System类中的两个成员变量：
 *		public static final InputStream in “标准”输入流。
 * 		public static final PrintStream out “标准”输出流。
 * 
 * 		InputStream is = System.in;
 * 		PrintStream ps = System.out;
 */
public class SystemOutTest {
	public static void main(String[] args) throws IOException {
		System.out.println("helloworld");
		PrintStream ps = System.out;
		ps.println("helloworld");
		ps.println();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				System.out));
		bw.write("hello");
		bw.newLine();
		bw.write("world");
		bw.newLine();
		bw.write("java");
		bw.newLine();
		bw.flush();
		
		bw.close();
	}
}
