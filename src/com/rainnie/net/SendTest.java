package com.rainnie.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP协议发送数据：
 * A:创建发送端Socket对象
 * B:创建数据，并把数据打包
 * C:调用Socket对象的发送方法发送数据包
 * D:释放资源
 */
public class SendTest {
	public static void main(String[] args) throws IOException {
		//创建发送端Socket对象
		DatagramSocket ds=new DatagramSocket();
		
		//创建数据，并把数据打包
		byte[] bys="hello,bobo,I am coming".getBytes();
		int length=bys.length;
		InetAddress address=InetAddress.getByName("192.168.20.78");
		int port=10086;
		DatagramPacket dp=new DatagramPacket(bys, length, address, port);
		
		// 调用Socket对象的发送方法发送数据包
		ds.send(dp);
		
		// 释放资源
		ds.close();
		
	}
}
