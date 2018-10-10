package com.rainnie.thread2;

public class ThreadGroupTest {
	public static void main(String[] args) {
		//method1();
		method2();
		
		 
	}

	public static void method2() {
		MyRunnable mr=new MyRunnable();
		
		ThreadGroup tg=new ThreadGroup("我是线程组");
		
		Thread t1=new Thread(tg, mr, "线程1号");
		Thread t2=new Thread(tg, mr, "线程2号");
		
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		
		//这个组都是后台线程
		tg.setDaemon(true);
		t1.start();
		t2.start();
		
	}

	public static void method1() {
		MyRunnable mr=new MyRunnable();
		
		Thread t1=new Thread(mr,"线程1号");
		Thread t2=new Thread(mr, "线程2号");
		
		// 我不知道他们属于那个线程组,我想知道，怎么办
		// 线程类里面的方法：public final ThreadGroup getThreadGroup()
		ThreadGroup tg1=t1.getThreadGroup();
		ThreadGroup tg2=t2.getThreadGroup();
		String name1=tg1.getName();
		String name2=tg2.getName();
		
		System.out.println(name1);
		System.out.println(name2);
		// 通过结果我们知道了：线程默认情况下属于main线程组
		// 通过下面的测试，你应该能够看到，默任情况下，所有的线程都属于同一个组
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		
	}
}
