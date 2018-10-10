package com.rainnie.thread2;

public class ProducerAndConsumerTest {
	public static void main(String[] args) {
		SynStack stack=new SynStack();
		Producer p=new Producer(stack);
		Consumer c=new Consumer(stack);
		
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
	}
}
class Producer implements Runnable{
	SynStack stack;

	public Producer(SynStack stack) {
		 
		this.stack = stack;
	}

	@Override
	public void run() {
		 for(int i=0;i<20;i++) {
			 char c=(char) (Math.random()*26+'A');
			 stack.push(c);
			 try {
				Thread.sleep((int)(Math.random()*300));
			} catch (InterruptedException e) {
				 
				e.printStackTrace();
			}
		 }
		
	}
	
	
}

class Consumer implements Runnable{
	SynStack stack;
	

	public Consumer(SynStack stack) {
		 
		this.stack = stack;
	}

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			char c=stack.pop();
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
class SynStack{
	private int index=0;
	private char[] data=new char[6];
	
	public synchronized void push(char c) {
		//满了，就等待，不生产了
		while(index==data.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				 
				e.printStackTrace();
			}
		}
		this.notify();
		data[index]=c;
		index++;
		System.out.println("生产:"+c);
	}
	
	public synchronized char pop() {
		//没有，就等待,不消费了
		while(index==0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
			 
				e.printStackTrace();
			}
			 
		}
		this.notify();
		index--;
		System.out.println("消费"+data[index]);
		return data[index];
		
	}
}
