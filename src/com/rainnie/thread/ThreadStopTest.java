package com.rainnie.thread;
/*
 * public final void stop():让线程停止，过时了，但是还可以使用。
 * public void interrupt():中断线程。 把线程的状态终止，并抛出一个InterruptedException。
 */
public class ThreadStopTest {
	public static void main(String[] args) {
		ThreadStop ts=new ThreadStop();
		ts.start();
		try {
			//3秒 不执行就干掉
			Thread.sleep(3000);
			//ts.stop();
			ts.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
