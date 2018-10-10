package com.rainnie.thread2;

public class SetThread2 implements Runnable{
	private Student s;
	private int i=0;

	public SetThread2(Student s) {
		 
		this.s = s;
	}

	@Override
	public void run() {
		while(true) {
			synchronized (s) {
				if(i%2==0) {
					s.name="司马老贼";//刚走到这里，就被别人抢到了执行权
					s.age=20;
				}else {
					s.name="Doinb";//刚走到这里，就被别人抢到了执行权
					s.age=21;
				}
				i++;
			}
		}
		
	}
	
}
