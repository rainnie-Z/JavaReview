package com.rainnie.thetest;
/*
 * @功能:实现两个线程一个线程输出1、2、3…26，另外一个线程实现a、b、c…Z，两个线程交替输出
 * @开发者:Rainnie
 * @创建时间:2018/7/21
 */
public class ThreadTest {
	public static void main(String[] args) {
		Object obj=new Object();
		Word w=new Word(obj);
		Number n=new Number(obj);
		Thread t1=new Thread(n);
		Thread t2=new Thread(w);
		t1.start();
		t2.start();
	}
}

class Word extends Thread{
	 private Object obj; 
	public Word(Object obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		synchronized (obj) {
			for(char c ='a';c <='z';c++){
				System.out.print(c+",");
				 obj.notify();
				 try {
					obj.wait();
				} catch (InterruptedException e) {
					 
					e.printStackTrace();
				}
			}
		}
		 
	} 		 	 
		 
}

class Number extends Thread{
	 private Object obj; 
	public Number(Object obj) {
	 
		this.obj = obj;
	}
	@Override
	public void run() {
		synchronized (obj) {
			for(int i = 1;i <= 26;i++){
				 System.out.print(i+",");
				 obj.notify();
				 try {
					obj.wait();
				} catch (InterruptedException e) {
					 
					e.printStackTrace();
				}
	        }
		}
			  
	}
}
