package com.rainnie.exer2;

public class Book {
	public String name;
	public double price;
	public Book(){}
	public Book(String n,double p) {
		name=n;
		price=p;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double p) {
		price = p;
	}
	public void display() {
		System.out.println("书名:"+name+"\t价格:"+price);
	}
	
}
