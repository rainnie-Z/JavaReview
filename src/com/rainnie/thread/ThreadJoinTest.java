package com.rainnie.thread;
/*
 * public final void join():等待该线程终止。 
 */
public class ThreadJoinTest {
	public static void main(String[] args) {
		ThreadJoin tj1=new ThreadJoin();
		ThreadJoin tj2=new ThreadJoin();
		ThreadJoin tj3=new ThreadJoin();
		
		tj1.setName("老大线程");
		tj2.setName("小弟一号");
		tj3.setName("小弟二号");
		
		tj1.start();
		try {
			tj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tj2.start();
		tj3.start();
		
	}
}
