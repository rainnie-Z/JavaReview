package com.rainnie.file;

import java.io.File;

/*
 * 重命名功能:public boolean renameTo(File dest)
 * 		如果路径名相同，就是改名。
 * 		如果路径名不同，就是改名并剪切。
 * 
 * 路径以盘符开始：绝对路径	c:\\a.txt
 * 路径不以盘符开始：相对路径	a.txt
 */
public class FileTest04 {
	public static void main(String[] args) {
		File file=new File("a.PNG");
		File newFile=new File("E:\\b.PNG");
		System.out.println("renameTo:"+file.renameTo(newFile));
	}
	 
}
