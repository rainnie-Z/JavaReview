package com.rainnie.thread2;

public class GetThread4 implements Runnable{
	private Student4 s;

	public GetThread4(Student4 s) {
		this.s = s;
	}

	@Override
	public void run() {
		while(true) {
			s.get();
		}
		
	}
	
}
