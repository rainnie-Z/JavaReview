package com.rainnie.thread2;
/*
 * 最终版代码中：
 * 		把Student的成员变量给私有的了。
 * 		把设置和获取的操作给封装成了功能，并加了同步。
 * 		设置或者获取的线程里面只需要调用方法即可。
 */
public class StudentTest4 {
	public static void main(String[] args) {
		Student4 s=new Student4();
		SetThread4 st=new SetThread4(s);
		GetThread4 gt=new GetThread4(s);
		
		Thread t1=new Thread(st);
		Thread t2=new Thread(gt);
		
		t1.start();
		t2.start();
	}
}
