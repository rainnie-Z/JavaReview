package com.rainnie.thread;

import java.util.Date;

public class ThreadSleep extends Thread{
	@Override
	public void run() {
		 for(int x=0;x<100;x++) {
			 System.out.println(getName() + ":" + x + ",日期：" + new Date());
			 //休眠1秒
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				 
				e.printStackTrace();
			}
		 }
	}
}
