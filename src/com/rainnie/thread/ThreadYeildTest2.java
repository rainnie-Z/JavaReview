package com.rainnie.thread;

import java.util.Date;

public class ThreadYeildTest2 {
	public static void main(String[] args) {
		Thread t1=new ThreadYeild2(false);
		Thread t2=new ThreadYeild2(true);
		Thread t3=new ThreadYeild2(false);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
class ThreadYeild2 extends Thread{
	private boolean flag;

	public ThreadYeild2(boolean flag) {
		 
		this.flag = flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public void run() {
		long startTime=new Date().getTime();
		for(int i=0;i<500;i++) {
			if(flag) {
				Thread.yield();
			}
			System.out.print(this.getName()+":"+i+"\t");
		}
		long endTime=new Date().getTime();
		System.out.println("\n"+this.getName()+"执行时间:"+(endTime-startTime)+"毫秒");
		super.run();
	}
	
	
}
