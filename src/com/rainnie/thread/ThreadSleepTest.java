package com.rainnie.thread;

/*
 * 线程休眠
 *		public static void sleep(long millis)
 */
public class ThreadSleepTest {
	public static void main(String[] args) {
		ThreadSleep ts1=new ThreadSleep();
		ThreadSleep ts2=new ThreadSleep();
		ThreadSleep ts3=new ThreadSleep();
		
		ts1.setName("线程1");
		ts2.setName("线程2");
		ts3.setName("线程3");
		
		ts1.start();
		ts2.start();
		ts3.start();
		
	}
}
