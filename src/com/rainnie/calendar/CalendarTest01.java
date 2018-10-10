package com.rainnie.calendar;

import java.util.Calendar;

public class CalendarTest01 {
	public static void main(String[] args) {
		/*
		 * public int get(int field):返回给定日历字段的值。日历类中的每个日历字段都是静态的成员变量，并且是int类型。
		 */
		//使用默认时区和区域设置获取日历。 
		Calendar c=Calendar.getInstance();
		int y=c.get(Calendar.YEAR);
		int m=(c.get(Calendar.MONTH))+1;//注意，month应该加1
		int d=c.get(Calendar.DAY_OF_MONTH);
		int weekday=c.get(Calendar.DAY_OF_WEEK);
		System.out.println(y+"年"+m+"月"+d+"日"+"  星期"+weekday);
		System.out.println("====================");

		/*
		 * public void add(int field,int amount):根据给定的日历字段和对应的时间，来对当前的日历进行操作。
		 * public final void set(int year,int month,int date):设置当前日历的年月日
		 */
		// 5年后的10天前
		c.add(Calendar.YEAR, 5);
		c.add(Calendar.DATE, -10);
		System.out.println();
		int y2=c.get(Calendar.YEAR);
		int m2=(c.get(Calendar.MONTH))+1;//注意，month应该加1
		int d2=c.get(Calendar.DAY_OF_MONTH);
		int weekday2=c.get(Calendar.DAY_OF_WEEK);
		System.out.println(y2+"年"+m2+"月"+d2+"日"+"  星期"+weekday2);
		
	}
}
