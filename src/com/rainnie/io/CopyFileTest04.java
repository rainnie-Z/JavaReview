package com.rainnie.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
*
* 
* 
* 分析：
* 		复制数据，如果我们知道用记事本打开并能够读懂，就用字符流，否则用字节流。
* 		通过该原理，我们知道我们应该采用字节流。
* 		而字节流有4种方式，所以做这个题目我们有4种方式。推荐掌握第4种。
* 
* 数据源：
* 		c:\\a.jpg -- FileInputStream -- BufferedInputStream
* 目的地：
* 		d:\\b.jpg -- FileOutputStream -- BufferedOutputStream
*/
public class CopyFileTest04 {
	public static void main(String[] args) throws IOException {
		long startTime=System.currentTimeMillis();
		System.out.println("开始复制---");
		//method1("E:\\demo\\01-html的简介.avi","E:\\demo2\\01-html的简介.avi");//91190毫秒
		//method2("E:\\demo\\01-html的简介.avi","E:\\demo2\\01-html的简介2.avi");//126毫秒
		 
		//method3("E:\\demo\\01-html的简介.avi","E:\\demo2\\01-html的简介3.avi");//678毫秒
		method4("E:\\demo\\01-html的简介.avi","E:\\demo2\\01-html的简介4.avi");//47毫秒
		long endTime=System.currentTimeMillis();
		System.out.println("复制结束------------");
		System.out.println("耗时:"+(endTime-startTime)+"毫秒");
	}

	public static void method4(String src, String dest) throws IOException {
		 BufferedInputStream bis=new BufferedInputStream(new FileInputStream(src));
		 BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(dest));
		 byte[] bys=new byte[1024];
		 int len=0;
		 
		 while((len=bis.read(bys))!=-1) {
			 bos.write(bys);
		 }
		 bos.close();
		 bis.close();
	}

	public static void method3(String src, String dest) throws IOException {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(dest));
		
		int by=0;
		while((by=bis.read())!=-1) {
			bos.write(by);
		}
		bos.close();
		bis.close();
	}

	public static void method2(String src, String dest) throws IOException {
		FileInputStream fis=new FileInputStream(src);
		FileOutputStream fos=new FileOutputStream(dest);
		byte[] bys=new byte[1024];
		int len=0;
		while((len=fis.read(bys))!=-1) {
			fos.write(bys);
		}
		fos.close();
		fis.close();
		
	}

	public static void method1(String src, String dest) throws IOException {
		 FileInputStream fis=new FileInputStream(src);
		 FileOutputStream fos=new FileOutputStream(dest);
		 int by=0;
		 while((by=fis.read())!=-1) {
			 fos.write(by);
		 }
		 fos.close();
		 fis.close();
		
	}
}
