package com.rainnie.object;

public class HashCode01 {
	public static void main(String[] args) {
		Fruit f1=new Fruit("香蕉");
		Fruit f2=new Fruit("苹果");
		int handle=f1.hashCode();
		System.out.println(handle);
		System.out.println(Integer.toHexString(handle));
		System.out.println(f1);
		System.out.println("----------");
		System.out.println(f2.hashCode());
	}
}
class Fruit{
	private String name;

	public Fruit(String name) {
		this.name = name;
	}
	
}
