package com.rainnie.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/*
 * InputStreamReader(InputStream is):用默认的编码读取数据
 * InputStreamReader(InputStream is,String charsetName):用指定的编码读取数据
 */
public class InputStreamReaderTest {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		// InputStreamReader isr = new InputStreamReader(new FileInputStream(
				// "a.txt"));
		InputStreamReader isr = new InputStreamReader(new FileInputStream(
				"a.txt"), "UTF-8");
		int ch = 0;
		while ((ch = isr.read()) != -1) {
			System.out.print((char) ch);
		}
		
		/*// 一次读取一个字符数组
		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}*/

		// 释放资源
		isr.close();

	}
}
