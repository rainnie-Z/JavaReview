package com.rainnie.thread2;
/*
 * 消费者
 */
public class GetThread implements Runnable{
	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		System.out.println(s.name+"---"+s.age);
		
	}
	
	
	
}
