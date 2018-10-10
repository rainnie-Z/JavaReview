package com.rainnie.file;

import java.io.File;

/*
 * File(String pathname)：根据一个路径得到File对象
 * 		File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
 * 		File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
 */
public class FileTest01 {
	public static void main(String[] args) {
		File file=new File("D:\\demo\\a.txt");
		File file2=new File("D:\\demo","a.txt");
		File file3=new File("D:\\demo");
		File file4=new File(file3,"a.txt");
		// 以上三种方式其实效果一样
	}
}
