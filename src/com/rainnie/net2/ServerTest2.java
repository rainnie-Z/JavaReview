package com.rainnie.net2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest2 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(8888);
		Socket s=ss.accept();
		
		InputStream is=s.getInputStream();
		byte[] bys=new byte[1024];
		int len=is.read(bys);
		String server=new String(bys,0,len);
		String ip=s.getInetAddress().getHostAddress();
		System.out.println("server:"+ip+server);
		
		OutputStream os=s.getOutputStream();
		os.write("数据已经收到了".getBytes());
		
		s.close();
	}
}
