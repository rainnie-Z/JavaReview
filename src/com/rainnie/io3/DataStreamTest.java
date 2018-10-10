package com.rainnie.io3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 可以读写基本数据类型的数据
 * 数据输入流：DataInputStream
 * 			DataInputStream(InputStream in)
 * 数据输出流：DataOutputStream
 * 			DataOutputStream(OutputStream out) 
 */
/*
 * 内存操作流：用于处理临时存储信息的，程序结束，数据就从内存中消失。
 * 字节数组：
 * 		ByteArrayInputStream
 * 		ByteArrayOutputStream
 * 字符数组：
 * 		CharArrayReader
 * 		CharArrayWriter
 * 字符串：
 * 		StringReader
 * 		StringWriter
 * 
 * 用法和OutputStream与InputStream相同
 */

public class DataStreamTest {
	public static void main(String[] args) throws IOException {
		write();
		read();
		 
	}

	public static void read() throws IOException {
		DataInputStream dis=new DataInputStream(new FileInputStream("a.txt"));
		byte b = dis.readByte();
		short s = dis.readShort();
		int i = dis.readInt();
		long l = dis.readLong();
		float f = dis.readFloat();
		double d = dis.readDouble();
		char c = dis.readChar();
		boolean bb = dis.readBoolean();
		
		dis.close();

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bb);
	}

	public static void write() throws IOException {
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("a.txt"));
		dos.writeByte(10);
		dos.writeShort(100);
		dos.writeInt(1000);
		dos.writeLong(10000);
		dos.writeFloat(12.34F);
		dos.writeDouble(12.56);
		dos.writeChar('a');
		dos.writeBoolean(true);
		dos.close();
		
		
	}
}
