package com.rainnie.thread;

public class MyThead extends Thread{
	@Override
	public void run() {
		for(int x=0;x<100;x++) {
			System.out.println(x);
		}
	}
}
