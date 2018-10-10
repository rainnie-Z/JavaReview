package com.rainnie.exer4;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestAddress {
	public static void main(String[] args) {
		try {
			InetAddress ia=InetAddress.getLocalHost();
			showInfo(ia);
			System.out.println("====================");
			ia=InetAddress.getByName("www.sina.com.cn");
			showInfo(ia);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void showInfo(InetAddress ia) {
		 String name=ia.getHostName();
		 String ip=ia.getHostAddress();
		 System.out.println(name+":"+ip);
		 
		
	}
}
