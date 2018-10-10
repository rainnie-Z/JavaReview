package com.rainnie.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest01 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("a.txt");
		int by=0;
		while((by=fis.read())!=-1) {
			System.out.print((char)by);
		}
		fis.close();
		
	}
}
