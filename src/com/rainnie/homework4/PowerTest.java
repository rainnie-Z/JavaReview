package com.rainnie.homework4;

public class PowerTest {
	public static void main(String[] args) {
		Power p=new Tv("电视");
		p.getPower();
		Power p2=new Air("风扇");
		p2.getPower();
		Power p3=new Refrigerator("冰箱");
		p3.getPower();
	}
}
interface Power{
	public abstract void getPower();
}
class Tv implements Power{
	private String name;
	
	public Tv() {
		
	}


	public Tv(String name) {
		this.name = name;
	}


	@Override
	public void getPower() {
		 System.out.println("有了电源，"+name+"才能工作");
		
	}
	
}
class Air implements Power{

	private String name;
	public Air() {
	}
    
	public Air(String name) {
		this.name = name;
	}

	@Override
	public void getPower() {
		 System.out.println("有了电源，"+name+"才能工作");
		
	}
	
}
class Refrigerator implements Power{
	private String name;

	public Refrigerator() {
		
	}
	public Refrigerator(String name) {
		this.name = name;
	}

	@Override
	public void getPower() {
		 System.out.println("有了电源，"+name+"才能工作");
		
	}
}
