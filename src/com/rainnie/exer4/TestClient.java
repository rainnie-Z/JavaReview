package com.rainnie.exer4;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {
	public static void main(String[] args) {
		try {
			Socket s1=new Socket("192.168.20.78",8888);
			InputStream is=s1.getInputStream();
			DataInputStream dis=new DataInputStream(is);
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
			dis.close();
			s1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
