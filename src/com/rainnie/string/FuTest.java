package com.rainnie.string;

public class FuTest {
	public static void main(String[] args) {
		Fu f=new Zi();
		f.show();
		/*Zi z=(Zi)f;
		z.display();*/
		
		
		
	}
}
class Fu{
	public void show() {
		System.out.println("show fu");
	}
}
class Zi extends Fu{
	/*public void show() {
		System.out.println("show zi");
	}*/
	public void display() {
		System.out.println("display zi");
	}
}