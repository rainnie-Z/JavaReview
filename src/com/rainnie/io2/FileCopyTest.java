package com.rainnie.io2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：复制单极文件夹
 * 
 * 数据源：e:\\demo
 * 目的地：e:\\test
 * 
 * 分析：
 * 		A:封装目录
 * 		B:获取该目录下的所有文本的File数组
 * 		C:遍历该File数组，得到每一个File对象
 * 		D:把该File进行复制
 */
public class FileCopyTest {
	public static void main(String[] args) throws IOException {
		File src=new File("E:\\demo");
		File dest=new File("E:\\test");
		
		if(!dest.exists()) {
			dest.mkdir();
		}
		
		File[] fileArray=src.listFiles();
		for(File file:fileArray) {
			//打印file，这时候会得到比如这个样子:E:\\demo\\a.txt
			//但是现在我们的目标路径是E:\\test\\a.txt;
			//因此只是后面的名字不同，所以说dest可以得到E:\\test,name可以得到a.txt;
			String name=file.getName();
			File newFile=new File(dest,name);
			copyFile(file,newFile);
		}
	}

	public static void copyFile(File file, File newFile) throws IOException {
		 BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
		 BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newFile));
		 byte[] bys=new byte[1024];
		 int len=0;
		 while((len=bis.read(bys))!=-1) {
			 bos.write(bys, 0, len);
		 }
		 bos.close();
		 bis.close();
		
	}
}
