package com.rainnie.calendar;

import java.util.Calendar;

public class FebruaryUtils {
	public static int getDays(int year){
		Calendar c=Calendar.getInstance();
		c.set(year, 2, 1);
		c.add(Calendar.DATE,-1);
		return c.get(Calendar.DATE);
		
	}
}
