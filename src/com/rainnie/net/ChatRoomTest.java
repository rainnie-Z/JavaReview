package com.rainnie.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ChatRoomTest {
	public static void main(String[] args) throws IOException {
		DatagramSocket dsSend=new DatagramSocket();
		DatagramSocket dsReceive=new DatagramSocket(12345);
		
		SendThreadTest st=new SendThreadTest(dsSend);
		ReceveThreadTest rt=new ReceveThreadTest(dsReceive);
		Thread t1=new Thread(st);
		Thread t2=new Thread(rt);
		t1.start();
		t2.start();
	}
}
