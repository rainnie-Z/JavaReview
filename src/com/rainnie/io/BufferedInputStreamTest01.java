package com.rainnie.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamTest01 {
	public static void main(String[] args) throws IOException{
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:/javaio.txt"));
		byte[] bys=new byte[1024];
		int len=0;
		while((len=bis.read(bys))!=-1){
			System.out.println(new String(bys,0,len));
		}
		bis.close();
	}
}
