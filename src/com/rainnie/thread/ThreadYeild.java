package com.rainnie.thread;

public class ThreadYeild extends Thread{
	@Override
	public void run() {
		 for(int x=0;x<100;x++) {
			 System.out.println(getName()+":"+x);
			 Thread.yield();
		 }
	}
}
