package com.rainnie.file;

import java.io.File;
import java.io.IOException;
/*
 * 1.如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
 * 2.Java中的删除不走回收站。
 * 3.要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
 */
public class FileTest03 {
	public static void main(String[] args) throws IOException {
		File file=new File("a.txt");
		System.out.println("createNewfile:"+file.createNewFile());
		File file2=new File("E:\\aaa\\bbb\\ccc");
		System.out.println("delete:"+file2.delete());//这里是删除ccc
		File file3=new File("E:\\aaa");
		System.out.println("delete:"+file3.delete());
	}
}
