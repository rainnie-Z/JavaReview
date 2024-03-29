package com.rainnie.map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest01 {
	public static void main(String[] args) {
		TreeMap<Student,String> tm=new TreeMap<Student,String>(
				new Comparator<Student>(){
					@Override
					public int compare(Student s1, Student s2) {
						//主要条件
						int num=s1.getAge()-s2.getAge();
						//次要条件
						int num2=num==0?s1.getName().compareTo(s2.getName()):num;
						return num2;
					}
					
				});
		Student s1 = new Student("潘安", 30);
		Student s2 = new Student("柳下惠", 35);
		Student s3 = new Student("唐伯虎", 33);
		Student s4 = new Student("燕青", 32);
		Student s5 = new Student("唐伯虎", 33);
		
		tm.put(s1, "宋朝");
		tm.put(s2, "元朝");
		tm.put(s3, "明朝");
		tm.put(s4, "清朝");
		tm.put(s5, "汉朝");
		
		Set<Student> set=tm.keySet();
		for(Student key:set) {
			String value=tm.get(key);
			System.out.println(key.getName()+"---"+key.getAge()+"---"+value);
		}
		/*
		 * 键相同，值覆盖，所以唐伯虎是汉朝的
		 */
		
	}
} 
