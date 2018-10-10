package com.rainnie.thread2;

public class DieLock extends Thread{
	public boolean flag;

	public DieLock(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public void run() {
		if(flag) {
			synchronized (MyLock.objA) {
				System.out.println("if objA");
				synchronized (MyLock.objB) {
					System.out.println("if objB");
				}
			}
		}else {
			synchronized (MyLock.objB) {
				System.out.println("else objB");
				synchronized (MyLock.objA) {
					System.out.println("else objA");
				}
			}
		}
		super.run();
	}
	
}
