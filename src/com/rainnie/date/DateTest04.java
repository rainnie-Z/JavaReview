package com.rainnie.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest04 {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你的出生年月(xxxx-xx-xx):");
		String birthday=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d=sdf.parse(birthday);
		long birtTime=d.getTime();
		long nowTime=System.currentTimeMillis();
		long time=nowTime-birtTime;
		long days=time/1000/60/60/24;
		System.out.println("你来这世上已经"+days+"天");
	}
}
