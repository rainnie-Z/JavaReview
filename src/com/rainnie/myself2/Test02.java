package com.rainnie.myself2;

public class Test02 {
	public static void main(String[] args) {
		/*Person2.total = 100;
		System.out.println(Person2.total);
		Person2 p1 = new Person2();
		Person2 p2 = new Person2();
		System.out.println(Person2.total);*/
		System.out.println(Person2.getTotalPerson());
		Person2 p1 = new Person2();
		System.out.println(p1.getTotalPerson());
		System.out.println(Person2.getTotalPerson());

	}
}
class Person2{  
/*private int id;
public static int total = 0;
public Person2(){
total ++;
id = total;
}*/
	private int id;
	private static int total = 0;
	public Person2() {
	total++;
	id = total;
	}
	public int getId(){
	return id;
	}
	public static int getTotalPerson() {
	return total;
	}

}