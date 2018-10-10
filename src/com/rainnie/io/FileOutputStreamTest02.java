package com.rainnie.io;
/*
 * public void write(int b):写一个字节
 * public void write(byte[] b):写一个字节数组
 * public void write(byte[] b,int off,int len):写一个字节数组的一部分
 */
 

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest02 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("a.txt");
		byte[] bys= {97,98,99,100,101};
		fos.write(bys);
		fos.write(bys, 1, 4);
		fos.close();
	}
}
