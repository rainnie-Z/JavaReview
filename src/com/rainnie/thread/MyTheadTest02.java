package com.rainnie.thread;
/*
 * 如何获取线程对象的名称呢?
 * public final String getName():获取线程的名称。
 * 如何设置线程对象的名称呢?
 * public final void setName(String name):设置线程的名称
 * 
 * 针对不是Thread类的子类中如何获取线程对象名称呢?
 * public static Thread currentThread():返回当前正在执行的线程对象
 * Thread.currentThread().getName()
 */
public class MyTheadTest02 {
	public static void main(String[] args) {
		MyThead2 mt1=new MyThead2("线程1");
		MyThead2 mt2=new MyThead2("线程2");
		System.out.println(Thread.currentThread().getName());//main
		mt1.start();
		mt2.start();
	}
}
 