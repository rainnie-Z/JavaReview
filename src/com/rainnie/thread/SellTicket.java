package com.rainnie.thread;

public class SellTicket extends Thread{
	//因为票是多个线程共享的，所以说用static修饰
	private static int tickets=100;
	@Override
	public void run() {
		 while(true) {
			 if(tickets>0) {
				 System.out.println(getName()+"正在出售第"+(tickets--)+"张票");
			 }
		 }
	}
}
