package com.rainnie.thread;

public class MyThead2 extends Thread{

	public MyThead2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyThead2(String name) {
		super(name);
		 
	}
	@Override
	public void run() {
		 for(int x=0;x<100;x++) {
			 System.out.println(getName()+":"+x);
		 }
	}
	
}
