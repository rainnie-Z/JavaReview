package com.rainnie.stringbuffer;

import java.util.Date;

public class StringBufferTest01 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abc");
		sb.append("defg");
		System.out.println(sb);
		sb.insert(3,"---");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.append(new Date());
		System.out.println(sb);
		sb.setCharAt(1,'d');
		System.out.println(sb);
	}
}
