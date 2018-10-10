package com.rainnie.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 如何实现数据的换行?
 *       windows:\r\n
 * 如何实现数据的追加写入?
 *     用构造方法带第二个参数是true的情况即可
 *     没有true的话，后面写的会覆盖前面写的。
 */
public class FileOutputStreamTest03 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("a.txt",true);
		for(int i=0;i<10;i++) {
			fos.write(("hello,"+i).getBytes());
			fos.write("\r\n".getBytes());
		}
		fos.close();
	}
}
