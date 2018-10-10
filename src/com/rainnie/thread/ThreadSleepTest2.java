package com.rainnie.thread;

import java.util.Random;

public class ThreadSleepTest2 {
	public static void main(String[] args) {
		Tomato to=new Tomato();
		 
		for(int i=0;i<=10;i++) {
			Thread t=new Thread(to, getRandomString());
			t.start();
		}
		 
	}

	private static String getRandomString() {
		String[] names= {"张三","李四","王五","赵六","陈七","胡八"};
		
		Random random=new Random();
		int index=random.nextInt(names.length);
		
		return names[index];
	}
	
	private static String getRandomString(int length) {
		String base="abcdefghijklmnopqrstuvwxyz";
		Random random=new Random();
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<length;i++) {
			int number=random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
		
	}
}
class Tomato implements Runnable{

	@Override
	public  synchronized void run() {
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println(Thread.currentThread().getName()+"吃到了一个西红柿");
		}
		
	}
	
}
