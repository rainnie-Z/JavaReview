package com.rainnie.thread;

/*
 * public final void setDaemon(boolean on):将该线程标记为守护线程或用户线程。
 * 当正在运行的线程都是守护线程时，Java 虚拟机退出。 该方法必须在启动线程前调用。 
 * 
 * 游戏：坦克大战。
 */
public class ThreadDaemonTest {
	public static void main(String[] args) {
		ThreadDaemon td1=new ThreadDaemon();
		ThreadDaemon td2=new ThreadDaemon();
		
		td1.setName("英雄1号");
		td2.setName("英雄2号");
		
		td1.setDaemon(true);
		td2.setDaemon(true);
		
		td1.start();
		td2.start();
		
		Thread.currentThread().setName("水晶池");
		for(int x=0;x<=5;x++) {
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
	}
}
