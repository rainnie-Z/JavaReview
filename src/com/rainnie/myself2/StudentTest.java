package com.rainnie.myself2;

public class StudentTest {
	public static void main(String[] args) {
		Student s=new Student();
		
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		
		s.name="Rainnie";
		s.age=27;
		s.address="北京";
	    
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		
		s.study();
		s.eat();
		s.sleep();
	}
}
