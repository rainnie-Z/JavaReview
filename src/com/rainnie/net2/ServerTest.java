package com.rainnie.net2;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(8888);
		Socket s=ss.accept();
		InputStream is=s.getInputStream();
		
		byte[] bys=new byte[1024];
		int len=is.read(bys);
		String str=new String(bys,0,len);
		String ip=s.getInetAddress().getHostAddress();
		System.out.println(ip+"---"+str);
		s.close();
	}
}
