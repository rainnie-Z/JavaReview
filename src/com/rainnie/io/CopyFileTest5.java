package com.rainnie.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyFileTest5 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(new FileInputStream("a.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"b.txt"));
		// 读写数据
		// 方式1
		// int ch = 0;
		// while ((ch = isr.read()) != -1) {
		// osw.write(ch);
		// }

		// 方式2
		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			osw.write(chs, 0, len);
			// osw.flush();
		}

		// 释放资源
		osw.close();
		isr.close();
	}
}
