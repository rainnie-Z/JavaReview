package com.rainnie.thread;
/*
 * 方式2：实现Runnable接口
 * 步骤：
 * 		A:自定义类MyRunnable实现Runnable接口
 * 		B:重写run()方法
 * 		C:创建MyRunnable类的对象
 * 		D:创建Thread类的对象，并把C步骤的对象作为构造参数传递
 */
public class RunnableTest {
	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();
		Thread t1=new Thread(my,"线程1号");
		Thread t2=new Thread(my,"线程2号");
		
		t1.start();
		t2.start();
	}
}
