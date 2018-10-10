package com.rainnie.io3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 序列化流：把对象按照流一样的方式存入文本文件或者在网络中传输。对象 -- 流数据(ObjectOutputStream)
 * 反序列化流:把文本文件中的流对象数据或者网络中的流对象数据还原成对象。流数据 -- 对象(ObjectInputStream)
 */
public class SerizedTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		write();
		read();
	}

	public static void read() throws IOException, ClassNotFoundException {
		 ObjectInputStream ois=new ObjectInputStream(new FileInputStream("oos.txt"));
		 Object obj=ois.readObject();
		 ois.close();
		 System.out.println(obj);
		
	}

	public static void write() throws IOException {
		 ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("oos.txt"));
		 Student s=new Student("Rainnie",85);
		 oos.writeObject(s);
		 oos.close();
	}
}
