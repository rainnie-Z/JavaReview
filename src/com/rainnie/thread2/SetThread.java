package com.rainnie.thread2;
/*
 * 生产者
 */
public class SetThread  implements Runnable{
	private Student s;
	
	public SetThread(Student s) {
		this.s = s;
	}
	
	@Override
	public void run() {
		s.name="司马老贼";
		s.age=20;
		
	}

}
