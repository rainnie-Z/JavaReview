package com.rainnie.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTest02 {
	public static void main(String[] args) {
		Locale locale1=new Locale("zh","CN");
		Locale locale2=new Locale("en","US");
		
		SimpleDateFormat sdf1=new SimpleDateFormat();
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss E a z", locale1);
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss E a z",locale2);
		SimpleDateFormat sdf5=new SimpleDateFormat("yyyy年MM月dd日 E a HH点mm分ss秒");
		SimpleDateFormat sdf6=new SimpleDateFormat("'On' yyyy-MM-dd HH' 0''clok,We tested it'");
		
		Date d=new Date();
		Date d2=new Date();
		String s=sdf1.format(d);
		System.out.println(s);
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));
		System.out.println(sdf5.format(d));
		System.out.println(sdf6.format(d));
		
		try {
			d=sdf2.parse("2008-08-08 17:25:45");
			d2=sdf2.parse("2008/08/08 17:25:45");//异常:Unparseable date: "2008/08/08 17:25:45"
			System.out.println(d);
			System.out.println(d2);
			d=sdf5.parse("2007年04月07日 星期二 上午 10点02分54秒");
			System.out.println(d);
		}catch(java.text.ParseException e) {
			e.printStackTrace();
		}
		
	}
}
