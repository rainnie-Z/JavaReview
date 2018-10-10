package com.rainnie.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date	 --	 String(格式化)
 * 		public final String format(Date date)
 * 
 * String -- Date(解析)
 * 		public Date parse(String source)
 * 
 * DateForamt:可以进行日期和字符串的格式化和解析，但是由于是抽象类，所以使用具体子类SimpleDateFormat。
 * 
 * SimpleDateFormat的构造方法：
 * 		SimpleDateFormat():默认模式
 * 		SimpleDateFormat(String pattern):给定的模式
 * 			这个模式字符串该如何写呢?
 * 			通过查看API，我们就找到了对应的模式
 * 			年 y
 * 			月 M	
 * 			日 d
 * 			时 H
 * 			分 m
 * 			秒 s
 * 
 * 			2014年12月12日 12:12:12
 */
public class DateTest03 {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		//创建格式化对象
		//SimpleDateFormat sdf=new SimpleDateFormat();
		//给定模式
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
		String s=sdf.format(d);
		System.out.println(s);
		
		
		String s2="2018年07月13日 19点05分49秒";
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
		Date d2=sdf2.parse(s2);
		System.out.println(d2);
		
	}
}
