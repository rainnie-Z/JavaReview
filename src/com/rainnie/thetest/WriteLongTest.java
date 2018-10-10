package com.rainnie.thetest;
/*
 * @功能:实现将一个long类型的数据写入到文件中
 * @开发者:Rainnie
 * @创建时间:2018/7/21
 */
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteLongTest {
	public static void main(String[] args) throws IOException{
		  write();
	}
	public static void write() throws IOException {
		DataOutputStream  dos=new DataOutputStream(new FileOutputStream("a.txt"));
		 dos.writeLong(10000L);
		 dos.close();
		
	}
}
