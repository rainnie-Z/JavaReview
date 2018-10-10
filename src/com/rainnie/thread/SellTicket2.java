package com.rainnie.thread;

public class SellTicket2 implements Runnable{
	private static int tickets=100;
	@Override
	public void run() {
		 while(true) {
			 if(tickets>0) {
				 System.out.println(Thread.currentThread().getName()+"正在出售第"+(tickets--)+"张票");
			 }
		 }
		
	}
	
}
