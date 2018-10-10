package com.rainnie.exer3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class EatLanchTest {
	/*static List<String> names=new ArrayList<String>();*/
	public static void main(String[] args) {
		
		 
	/*	names.add("张三");
		names.add("李四");
		names.add("王五");
		names.add("赵六");
		names.add("陈七");
		names.add("胡八");*/
		
		 

		Lanch l=new Lanch();
		/*for(int i=0;i<6;i++) {
			new Thread(l,getRandomString()).start();
		}
        */
			 
		 
		String[] names= {"张三","李四","王五", "赵六","陈七", "胡八"};
		for(int x=0;x<names.length;x++) {
			new Thread(l,names[x]).start();
		}
		/*Thread t1=new Thread(l, "张三");
		Thread t2=new Thread(l, "李四");
		Thread t3=new Thread(l, "王五");
		Thread t4=new Thread(l, "赵六");
		Thread t5=new Thread(l, "陈七");
		Thread t6=new Thread(l, "胡八");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();*/
	}

	/*private static String getRandomString() {
		 String name=null;
		 Random r=new Random();
		 int number=r.nextInt(names.size());
		 name=names.get(number);
		 names.remove(number);
		return name;
	}*/

	 
	
}
class Lanch implements Runnable{
	 

	@Override
	public synchronized void run() {
		 /*long time=new Date().getTime();*/
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
			 System.out.println(getTime()+Thread.currentThread().getName()+"去吃了午饭");
		 }
	}

	private String getTime() {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
		String s=sdf.format(d);
		return s;
	}
	
}
