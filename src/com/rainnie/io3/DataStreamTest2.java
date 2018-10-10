package com.rainnie.io3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class DataStreamTest2 {
	public static void main(String[] args) throws IOException {
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("b.txt"));
		DataInputStream dis=new DataInputStream(new FileInputStream("b.txt"));
		dos.writeUTF("休.给兰特");
		dos.writeInt(40);
		dos.close();
		System.out.println("name:"+dis.readUTF());
		System.out.println("age:"+dis.readInt());
		dis.close();
	}
}
