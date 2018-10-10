package com.rainnie.homework6;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector<Dog> vc=new Vector<Dog>();
		vc.add(new Dog("旺财","黄色"));
		vc.add(new Dog("雪莉","白色"));
		vc.add(new Dog("大白","白色"));
		vc.add(new Dog("黑豹","黑色"));
		
		Iterator<Dog> it=vc.iterator();
	/*	while(it.hasNext()) {
			Dog d=it.next();
			if(d.getColor().equals("白色")) {
				it.remove();
			}else if(d.getColor().equals("黄色")) {
				d.setColor("白色");
				System.out.println(d.getName()+"---"+d.getColor());
			}else {
				System.out.println(d.getName()+"---"+d.getColor());
			}
			 
		}*/
		int i=0;
		while(it.hasNext()) {
			Dog d=it.next();
			if(d.getColor().equals("白色")){
				//System.out.println(d.getName()+"---"+d.getColor());
				System.out.println(d.getColor());
				it.remove();
				i++;
			}
			if(d.getColor().equals("黄色")) {
				d.setColor("黑色");
			}
			//System.out.println(d.getName()+"---"+d.getColor());
		}
		System.out.println(i);
		
		
		Iterator<Dog> it2=vc.iterator();
		while(it2.hasNext()) {
			Dog d2=it2.next();
			System.out.println(d2.getName()+"---"+d2.getColor());
		}
		 
	}
}
