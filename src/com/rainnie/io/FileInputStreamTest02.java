package com.rainnie.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest02 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		byte[] bys=new byte[1024];// 数组的长度一般是1024或者1024的整数倍
		int len=0;
		while((len=fis.read(bys))!=-1) {
			System.out.print(new String(bys,0,len));
		}
		fis.close();
	}
}
