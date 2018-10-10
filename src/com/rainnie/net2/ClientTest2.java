package com.rainnie.net2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest2 {
	public static void main(String[] args) throws IOException {
		Socket s=new Socket("192.168.20.24",8888);
		OutputStream os=s.getOutputStream();
		os.write("你好啊".getBytes());
		
		InputStream is=s.getInputStream();
		byte[] bys=new byte[1024];
		int len=is.read(bys);
		String client=new String(bys, 0, len);
		System.out.println("client:"+client);
		s.close();
		
	}
}
