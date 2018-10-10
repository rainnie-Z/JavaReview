package com.rainnie.exer;

public class MyDate {
	private int day;
	private int month;
	private int year;
	public  MyDate(int d,int m,int y) {
		day=d;
		month=m;
		year=y;
	}
	public void display() {
		System.out.println(day+"-"+month+"-"+year);
	}
}
