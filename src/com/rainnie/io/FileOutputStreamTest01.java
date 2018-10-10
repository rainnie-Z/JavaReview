package com.rainnie.io;


import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 字节输出流操作步骤:
 *       1.创建字节输出流对象
 *       2.写数据
 *       3.释放资源
 */
public class FileOutputStreamTest01 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("a.txt");
		fos.write("hello".getBytes());
		fos.write(" word".getBytes());
		fos.close();
	}
}
