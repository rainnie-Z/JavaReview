package com.rainnie.homework8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestDemo {
	 static List<String> names=new ArrayList<String>();
	public static void main(String[] args) {
		names.add("鲁一");
		names.add("萧二");
		names.add("张三");
		names.add("李四");
		names.add("王五");
		
		names.add("赵六");
		names.add("陈七");
		names.add("胡八");
		names.add("劳九");
		names.add("石十");
		Test t=new Test();
		 
		/*String[] names= {"鲁一","萧二","张三","李四","王五", "赵六","陈七", "胡八","劳九","石十"};*/
		for(int x=0;x<7;x++) {
			new Thread(t,getRandomString()).start();
		}
		
		try {
			Thread.currentThread().sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String nm:names) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				System.out.println(nm+"未通过考试");
			}
		}
	}
	private static String getRandomString() {
	 String name=null;
	 Random r=new Random();
	 int number=r.nextInt(names.size());
	 name=names.get(number);
	 names.remove(number);
	return name;
}
}
class Test implements Runnable{

	@Override
	public synchronized void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println(Thread.currentThread().getName()+"通过了考试");
		}
		
	}
	
}
