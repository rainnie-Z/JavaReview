package com.rainnie.thread2;

public class Student4 {
	private String name;
	private int age;
	private boolean flag;
	
	 public synchronized void set(String name,int age) {
		 if(this.flag) {
			 try {
				 this.wait();
			 }catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 this.name=name;
		 this.age=age;
		 
		 this.flag=true;
		 this.notify();
	 }
	 
	 public synchronized void get() {
		 if(!this.flag) {
			 try {
				 this.wait();
			 }catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 System.out.println(this.name+":"+this.age);
		 
		 this.flag=false;
		 this.notify();
	 }
}
