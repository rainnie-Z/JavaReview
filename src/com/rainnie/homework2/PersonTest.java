package com.rainnie.homework2;

public class PersonTest {
	public static void main(String[] args) {
		Person p=new Person();
		p.setId(1001);
		p.setUsername("zhangsan");
		p.setPassword("123321");
		p.showInfo();
		show(p);
	}

	private static void show(Person p) {
		System.out.println(p.getId()+"-"+p.getUsername()+"-"+p.getPassword());
		
	}
	
}
