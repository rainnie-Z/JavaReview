package com.rainnie.thread;

import java.util.Date;

public class ThreadStop extends Thread{
	 @Override
	public void run() {
		System.out.println("开始执行:"+new Date());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("结束执行:"+new Date());
	}
}
