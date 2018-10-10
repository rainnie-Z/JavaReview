package com.rainnie.thread2;
/*
 * 问题2：为了数据的效果好一些，我加入了循环和判断，给出不同的值,这个时候产生了新的问题
 * 		A:同一个数据出现多次
 * 		B:姓名和年龄不匹配
 * 原因：
 * 		A:同一个数据出现多次
 * 			CPU的一点点时间片的执行权，就足够你执行很多次。
 * 		B:姓名和年龄不匹配
 * 			线程运行的随机性
 * 线程安全问题：
 * 		A:是否是多线程环境		是
 * 		B:是否有共享数据		是
 * 		C:是否有多条语句操作共享数据	是
 * 解决方案：
 * 		加锁。
 * 		注意：
 * 			A:不同种类的线程都要加锁。
 * 			B:不同种类的线程加的锁必须是同一把。
 */
public class StudentTest2 {
	public static void main(String[] args) {
		Student s=new Student();
		SetThread2 st=new SetThread2(s);
		GetThread2 gt=new GetThread2(s);
		
		Thread t1=new Thread(st);
		Thread t2=new Thread(gt);
		
		t1.start();
		t2.start();
	}
}
