package com.rainnie.date;

import java.util.Date;
/*
 * Date():根据当前的默认毫秒值创建日期对象
 * Date(long date)：根据给定的毫秒值创建日期对象
 * public long getTime():获取时间，以毫秒为单位
 * public void setTime(long time):设置时间
 */
public class DateTest01 {
	public static void main(String[] args) {
		Date d1=new Date(2000);
		long time=d1.getTime();
		System.out.println(time);
		System.out.println(d1);
		
		Date d2=new Date();
		System.out.println(d2);
		long time2=d2.getTime();
		System.out.println(time2);
		System.out.println(d2.compareTo(d1));
		System.out.println(d1.equals(new Date(2000)));
		
	}
}
