package com.rainnie.thread2;

public class SetThread4 implements Runnable{
	private Student4 s;
	private int i;
	public SetThread4(Student4 s) {
		
		this.s = s;
	}
	@Override
	public void run() {
		while(true) {
			if(i%2==0) {
				 s.set("司马老贼", 20);
			}else {
				s.set("Doinb", 25);
			}
			i++;
		}
		
	}
	
}
