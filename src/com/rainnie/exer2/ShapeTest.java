package com.rainnie.exer2;

public class ShapeTest {
	public static void main(String[] args) {
		Tangle t=new Tangle(6);
		System.out.println(t.getPerimeter()+"-"+t.getArea());
		Rectangle rt=new Rectangle(8,4);
		System.out.println(rt.getPerimeter()+"-"+rt.getArea());
		Circus c=new Circus(5);
		System.out.println(c.getPerimeter()+"-"+c.getArea());
	}
}
abstract class Shape{
	public Shape() {
		
	}
	public abstract int getPerimeter();
	public abstract int getArea();
}
class Tangle extends Shape{
	private int length;
	public Tangle() {
		
	}
	public Tangle(int length) {
		this.length=length;
	}
	@Override
	public int getPerimeter() {
		 return length*4;
	}
	@Override
	public int getArea() {
		 
		return length*length;
	}
	
}
class Rectangle extends Shape{
	private int length;
	private int wide;
	
	public Rectangle() {
		 
	}
	public Rectangle(int length,int wide) {
		this.length=length;
		this.wide=wide;
	}

	@Override
	public int getPerimeter() {
		return (length+wide)*2;
	}
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return length*wide;
	}
	
}
 class Circus extends Shape{
	 private int radius;
	 public  Circus() {
		 
	}
	 public Circus(int radius) {
		 this.radius=radius;
	 }
	@Override
	public int getPerimeter() {
		 
		return (int) (2*Math.PI*radius);
	}

	@Override
	public int getArea() {
		 
		return (int) (Math.PI*radius*radius);
	}
	 
 }