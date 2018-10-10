package com.rainnie.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest02 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(new Student(1003,"张三",15));
		ts.add(new Student(1008,"李四",25));
		ts.add(new Student(1015,"王五",73));
		ts.add(new Student(1001,"赵六",49));
		 
		
		Iterator it=ts.iterator();
		while(it.hasNext()) {
			Student student=(Student) it.next();
			System.out.println(student);
		}
	}
}
