package com.rainnie.thread2;
/*
 *  问题3:虽然数据安全了，但是呢，一次一大片不好看，我就想依次的一次一个输出。
 * 如何实现呢?
 * 		通过Java提供的等待唤醒机制解决。
 * 
 * 等待唤醒：
 * 		Object类中提供了三个方法：
 * 			wait():等待
 * 			notify():唤醒单个线程
 * 			notifyAll():唤醒所有线程
 * 		为什么这些方法不定义在Thread类中呢?
 * 			这些方法的调用必须通过锁对象调用，而我们刚才使用的锁对象是任意锁对象。
 * 			所以，这些方法必须定义在Object类中。
 */
public class StudentTest3 {
	public static void main(String[] args) {
		Student s=new Student();
		SetThread3 st=new SetThread3(s);
		GetThread3 gt=new GetThread3(s);
		
		Thread t1=new Thread(st);
		Thread t2=new Thread(gt);
		
		t1.start();
		t2.start();
	}
}
