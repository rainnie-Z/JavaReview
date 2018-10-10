package com.rainnie.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
 

public class SendTest3 {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while((line=br.readLine())!=null) {
			if(line.equals("over")) {
				break;
			}
			byte[] bys=line.getBytes();
			DatagramPacket dp=new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.20.27"),12345);
			ds.send(dp);
		}
		ds.close();
	 
		
	}
}
