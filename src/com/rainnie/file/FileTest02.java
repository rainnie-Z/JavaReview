package com.rainnie.file;

import java.io.File;
import java.io.IOException;

/*
 *创建功能：
 *public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
 *public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
 *public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
 *
 *注意：你到底要创建文件还是文件夹，你最清楚，方法不要调错了。
 */
public class FileTest02 {
	public static void main(String[] args) throws IOException {
		File file=new File("E:\\demo");
		System.out.println("mkdir:"+file.mkdirs());
		
		File file2=new File("E:\\demo\\a.txt");
		System.out.println("createNewFile:"+file2.createNewFile());
		
		//系统找不到指定的路径。注意：创建文件，父类的文件必须存在.
		File file3=new File("E:\\demo2\\b.txt");
		//System.out.println("createNewFile:"+file3.createNewFile());
		//与上面不同，用下面的方法后，如果父类的文件不存在，它会自动帮你创建
		//但是要注意，此时的b.txt是一个文件名
		File file4=new File("E:\\demo2\\b.txt");
		System.out.println("mkdirs:"+file4.mkdirs());
	}
}
