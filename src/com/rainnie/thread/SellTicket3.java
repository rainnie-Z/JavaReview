package com.rainnie.thread;

public class SellTicket3 implements Runnable{
	private static int tickets=100;
	@Override
	public void run() {
		 while(true) {
			 if(tickets>0) {
				 //为了模拟真正的售票,延时1秒
				 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 System.out.println(Thread.currentThread().getName()+"正在售卖第"+(tickets--)+"张票");
			 }
		 }
		
	}

}
