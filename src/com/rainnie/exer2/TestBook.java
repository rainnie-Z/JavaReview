package com.rainnie.exer2;

public class TestBook {
	public static void main(String[] args) {
		Book b1=new Book();
		Book b2=new Book();
		
		b1.name="数据结构";
		b1.price=33.33;
		
		b2.setName("编译原理");
		b2.setPrice(22.22);
		
		System.out.println("书名:"+b1.getName()+"\t价格:"+b1.getPrice());
		System.out.println("书名:"+b2.getName()+"\t价格:"+b2.getPrice());
		
		Book b3=new Book("软件测试",66.66);
		b3.display();
	}
}
