package com.rainnie.thread;
/*
 * 方式1：继承Thread类。
 * 步骤
 * 		A:自定义类MyThread继承Thread类。
 * 		B:MyThread类里面重写run()?
 * 			为什么是run()方法呢?
 * 		C:创建对象
 * 		D:启动线程
 */

public class ThreadTest02 {
	public static void main(String[] args) {
		MyThead mt1=new MyThead();
		MyThead mt2=new MyThead();
		mt1.start();
		mt2.start();
	}
}
