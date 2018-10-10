package com.rainnie.thread;
/*
 * 相比3而言，加了一个锁对象
 */
public class SellTicket4 implements Runnable{
	private static int tickets=100;
	private Object obj=new Object();
	@Override
	public void run() {
		 while(true) {
			 synchronized (obj) {
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
}
