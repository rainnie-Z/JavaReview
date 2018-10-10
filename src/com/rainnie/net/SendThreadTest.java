package com.rainnie.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThreadTest implements Runnable{
	private DatagramSocket ds;
	

	public SendThreadTest(DatagramSocket ds) {
		this.ds = ds;
	}
	
	
	@Override
	public void run() {
		 
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String line=null;
			while((line=br.readLine())!=null) {
				if("over".equals(line)) {
					break;
				}
				byte[] bys=line.getBytes();
				DatagramPacket dp=new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.20.24"), 12345);
				ds.send(dp);
			}
			ds.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
