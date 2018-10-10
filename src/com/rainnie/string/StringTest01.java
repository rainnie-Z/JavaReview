package com.rainnie.string;

public class StringTest01 {
	public static void main(String[] args) {
		String s1="cares".concat("s");
		System.out.println("s1="+s1);
		
		String s2="mesquite int your cellar".replace('e','o');
		System.out.println("s2="+s2);
		
		String s3="woshirainnie".substring(4,8);
		System.out.println("s3="+s3);
		
		String s4="AbBCDE".toLowerCase();
		System.out.println("s4="+s4);
		
		String s5="abcCdef".toUpperCase();
		System.out.println("s5="+s5);
		
		String s6="  你好！ ".trim()+123;
		System.out.println("s6="+s6);
		
		String s="阳光,美女,沙滩,游轮,party";
		String[] results=s.split(",");
		for(String each:results) {
			System.out.println(each);
		}
		String str="This is a book";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(2));
		
		String str1="newArray";
		System.out.println(str1.startsWith("new"));
		
		String str2="abcd1234dcba4321";
		System.out.println(str2.indexOf("c"));
		System.out.println(str2.lastIndexOf("c"));
		
		String str3="123456";
		System.out.println(str3.length());
		
		String str4="abc";
		String str5="abc";
		String str6="cded";
		String str7="AbC";
		System.out.println("str4.equals(str5)="+str4.equals(str5));
		System.out.println("str4.equals(str6)="+str4.equals(str6));
		System.out.println("str4.equals(str7)="+str4.equals(str7));
		System.out.println("str4.equalsIgnoreCase(str7)="+str4.equalsIgnoreCase(str7));
		
		String str8="B";
		String str9="E";
		System.out.println(str9.compareTo(str8));
	}
}
