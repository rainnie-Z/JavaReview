package com.rainnie.thread2;

public class GetThread2 implements Runnable{
	private Student s;

	public GetThread2(Student s) {
		 
		this.s = s;
	}

	@Override
	public void run() {
		while(true) {
			synchronized (s) {
				System.out.println(s.name+"--"+s.age);
			}
		}
		
	}
	
	
}
