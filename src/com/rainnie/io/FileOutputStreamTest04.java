package com.rainnie.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 加入异常处理的字节输出流操作
 */
public class FileOutputStreamTest04 {
	public static void main(String[] args) {
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("a.txt");
			fos.write("java".getBytes());
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fos!=null) {
				try {
					fos.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
