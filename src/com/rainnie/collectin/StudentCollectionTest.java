package com.rainnie.collectin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StudentCollectionTest {
	
	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("风清扬", 30);
		Student s3 = new Student("令狐冲", 33);
		Student s4 = new Student("武鑫", 25);
		Student s5 = new Student("刘晓曲", 22);
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		// 把集合转成数组
		Object[] objs = c.toArray();
		for (int x = 0; x < objs.length; x++) {
			Student s=(Student) objs[x];
			System.out.println(s.getName() + "---" + s.getAge());
		}
		
		System.out.println("--------------");
		//使用迭代器
		Iterator it=c.iterator();
		while(it.hasNext()) {
			
			 Student s=(Student) it.next();
			 System.out.println(s.getName() + "---" + s.getAge());
		}
		
	}
}
