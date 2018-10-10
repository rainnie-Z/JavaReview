package com.rainnie.exer2;
/*
 * @功能:实现两个线程一个线程输出1、2、3…26，另外一个线程实现a、b、c…Z，两个线程交替输出,
 * @开发者:Rainnie
 * @创建时间:2018/7/21
 */

 



public class ThreadTest {
	public static void main(String[] args) {
		Object obj=new Object();
		Word w=new Word(obj);
		Number n=new Number(obj);
		w.start();
		n.start();
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
			for(char c ='A';c <='Z';c++){
				 System.out.print(c+",");
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
	        }
		}
			 
			 
	}
}