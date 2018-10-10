package com.rainnie.thread;
/*
 * public static void yield():暂停当前正在执行的线程对象，并执行其他线程。 
 * 让多个线程的执行更和谐，但是不能靠它保证一人一次。
 */
public class ThreadYeildTest {
	public static void main(String[] args) {
		ThreadYeild ty=new ThreadYeild();
		ThreadYeild ty2=new ThreadYeild();
		//如果这里不设置名字，系统会默认给Thread-0，Thread-1，Thread-2，...
		ty.start();
		ty2.start();
	}
}
