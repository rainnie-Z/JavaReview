package com.rainnie.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class SendTest2 {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		
		byte[] bys="我是发送的数据".getBytes();
		
		DatagramPacket dp=new DatagramPacket(bys, 0, bys.length, InetAddress.getByName("192.168.20.78"), 12345);
		ds.send(dp);
		
		ds.close();
	}
}
