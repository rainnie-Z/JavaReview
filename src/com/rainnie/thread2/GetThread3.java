package com.rainnie.thread2;
/*
 * 
 * 消费者
 *    先看是否有数据，有就消费，没有就等待，通知生成者生产数据
 */
public class GetThread3 implements Runnable{
	private Student s;

	public GetThread3(Student s) {
		 
		this.s = s;
	}

	@Override
	public void run() {
		 while(true) {
			 synchronized (s) {
				 if(!s.flag) {
					 try {
						 s.wait();//没有就等待
					 }catch(InterruptedException e) {
						 e.printStackTrace();
					 }
				 }
				 System.out.println(s.name+"---"+s.age);
				 
				 //同样，消费玩了，也要修改标记
				 s.flag=false;
				 //唤醒线程
				 s.notify();
			}
		 }
		
	}
	
	
}
