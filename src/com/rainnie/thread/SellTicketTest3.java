package com.rainnie.thread;
/*
 * 会出现两个问题：
 *    一张票被卖多次
 *    出现负数的票
 */
public class SellTicketTest3 {
	public static void main(String[] args) {
		SellTicket3 st=new SellTicket3();
		
		Thread t1=new Thread(st, "窗口1");
		Thread t2=new Thread(st, "窗口2");
		Thread t3=new Thread(st, "窗口3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
