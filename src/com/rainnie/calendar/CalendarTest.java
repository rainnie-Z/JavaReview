package com.rainnie.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		 
		CalendarTest ct=new CalendarTest();
		ct.display(c);
		c.set(2008, 8, 8);
		ct.display(c);
		c.set(2008, 8, 8, 10, 23,15);
		ct.display(c);
		Date d=c.getTime();
		System.out.println(d);
		Date d2=new Date();
		System.out.println(d2);
	}
	public void display(Calendar c) {
		String s=c.get(Calendar.YEAR)+"-"
	             +(c.get(Calendar.MONTH)+1)+"-"+
				c.get(Calendar.DATE)+" "+
	             c.get(Calendar.HOUR_OF_DAY)+":"+
				c.get(Calendar.MINUTE)+":"+
	             c.get(Calendar.SECOND)+" "+
				(c.get(Calendar.AM_PM)==0?"上午":"下午");
		System.out.println(s);
	}
}
