package com.rainnie.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileTest02 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("E:\\demo\\a.txt");
		FileOutputStream fos=new FileOutputStream("E:\\demo\\b.txt");
		
		byte[] bys=new byte[1024];
		int len=0;
		while((len=fis.read(bys))!=-1) {
			fos.write(bys,0,len);
		}
		
		fos.close();
		fis.close();
	}
}
