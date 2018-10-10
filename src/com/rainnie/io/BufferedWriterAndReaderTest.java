package com.rainnie.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符缓冲流的特殊方法：
 * BufferedWriter:
 * 		public void newLine():根据系统来决定换行符
 * BufferedReader:
 * 		public String readLine()：一次读取一行数据
 * 		包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
 */
/*
 * 同样，也可以使用通用的方法
 * char[] chs = new char[1024];
		int len = 0;
		while ((len = br.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}
 */
/*
 * 字符流为了高效读写，也提供了对应的字符缓冲流。
 * BufferedWriter:字符缓冲输出流
 * BufferedReader:字符缓冲输入流
 * 
 * BufferedWriter:字符缓冲输出流
 * 将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
 * 可以指定缓冲区的大小，或者接受默认的大小。在大多数情况下，默认值就足够大了。 
 */
public class BufferedWriterAndReaderTest {
	public static void main(String[] args) throws IOException {
		read();
		writer();
	}

	public static void writer() throws IOException {
		 BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt"));
		 for(int i=0;i<10;i++) {
			 bw.write("hello--"+i);
			 bw.newLine();
			 bw.flush();
		 }
		 bw.close();
		
	}

	public static void read() throws IOException {
		 BufferedReader br=new BufferedReader(new FileReader("a.txt"));
		 String line=null;
		 while((line=br.readLine())!=null) {
			 System.out.println(line);
		 }
		 br.close();
		
	}
}
