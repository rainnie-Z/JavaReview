package com.rainnie.io;
/*
 * OutputStreamWriter(OutputStream out):根据默认编码把字节流的数据转换为字符流
 * OutputStreamWriter(OutputStream out,String charsetName):根据指定编码把字节流数据转换为字符流
 * 把字节流转换为字符流。
 * 字符流 = 字节流 +编码表。
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest01 {
	public static void main(String[] args) throws IOException {
		//OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("a.txt"));//默认GBK
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("a.txt"),"UTF-8");
		osw.write("中国");


		// 写数据
		// public void write(int c):写一个字符
		// osw.write('a');
		// osw.write(97);
		// 为什么数据没有进去呢?
		// 原因是：字符 = 2字节
		// 文件中数据存储的基本单位是字节。
		// void flush()

		// public void write(char[] cbuf):写一个字符数组
		// char[] chs = {'a','b','c','d','e'};
		// osw.write(chs);

		// public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
		// osw.write(chs,1,3);

		// public void write(String str):写一个字符串
		// osw.write("我爱林青霞");

		// public void write(String str,int off,int len):写一个字符串的一部分
		osw.write("我爱林青霞", 2, 3);

		// 刷新缓冲区
		osw.flush();
		// osw.write("我爱林青霞", 2, 3);

		// 释放资源
		osw.close();
		// java.io.IOException: Stream closed
		// osw.write("我爱林青霞", 2, 3);
	}
}
