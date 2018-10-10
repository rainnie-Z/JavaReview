package com.rainnie.string;

/*
 * String s = new String(“hello”)和String s = “hello”;的区别?
 * 有。前者会创建2个对象，后者创建1个对象。
 * 
 * ==:比较引用类型比较的是地址值是否相同
 * equals:比较引用类型默认也是比较地址值是否相同，而String类重写了equals()方法，比较的是内容是否相同。
 * 
 *  字符串如果是变量相加，先开空间，在拼接。
 * 字符串如果是常量相加，是先加，然后在常量池找，如果有就直接返回，否则，就创建。
 */
public class StringDemo2 {
	public static void main(String[] args) {
		String s=new String("hello");
		String s2="hello";
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		String s3 = new String("hello");
		String s4 = "hello";
		System.out.println(s3 == s4); 
		System.out.println(s3.equals(s4)); 
		String s5 = "hello";
		String s6 = "hello";
		System.out.println(s5 == s6); 
		System.out.println(s5.equals(s6)); 
		System.out.println("-------------------------");
		String s7 = "hello";
		String s8 = "world";
		String s9 = "helloworld";
		System.out.println(s9 == s7 + s8);
		System.out.println(s9.equals((s7 + s8)));

		System.out.println(s9 == "hello" + "world");
		System.out.println(s9.equals("hello" + "world"));
	}
}
