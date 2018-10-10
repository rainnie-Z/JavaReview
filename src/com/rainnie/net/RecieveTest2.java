package com.rainnie.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class RecieveTest2 {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(12345);
		
		byte[] bys=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bys, bys.length);
		
		ds.receive(dp);
		
		String ip=dp.getAddress().getHostAddress();
		String s=new String(dp.getData(), 0, dp.getLength());
		System.out.println("The data from"+ip+"is:"+s);
	}
}
