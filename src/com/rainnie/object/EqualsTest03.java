package com.rainnie.object;

public class EqualsTest03 {
	public static void main(String[] args) {
		Person2 p1=new Person2(18);
		Person2 p2=new Person2(18);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
	}
}
class Person2{
	private int age;

	public Person2(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public boolean equals(Object o) {
		if(o instanceof Person2) {
			Person2 p=(Person2)o;
			if(this.age==p.age)
				return true;
			else
				return false;
		}
		return false;
	}
	
}
