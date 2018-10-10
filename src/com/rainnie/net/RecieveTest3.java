package com.rainnie.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class RecieveTest3 {
	public static void main(String[] args) throws IOException {
		/*DatagramSocket ds=new DatagramSocket(12345);*/
		DatagramSocket ds=new DatagramSocket(12345);
		while(true) {
			byte[] bys=new byte[1024];
			DatagramPacket dp=new DatagramPacket(bys, bys.length);
			ds.receive(dp);
			
			String ip=dp.getAddress().getHostAddress();
			String data=new String(bys, 0, bys.length);
			System.out.println("the data from"+ip+"is:"+data);
		}
		//ds.close();//应该一直开着接受数据不需要关闭
		
	}
}
