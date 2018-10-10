package com.rainnie.integer;
/*
 * Integer方法
 */
public class IntegerTest02 {
	public static void main(String[] args) {
		/*
		 * int类型和String类型的相互转换
		 * 
		 * int -- String
		 * 		String.valueOf(number)
		 * 
		 * String -- int
		 * 		Integer.parseInt(s)
		 * 
		 * 当然还有其他别的方法
		 */
		int num=100;
		String s=String.valueOf(num);
		System.out.println(s);
		
		String str="100";
		int it=Integer.parseInt(str);
		System.out.println(it/2);
		System.out.println("===============");
		/*
		 * 常用的基本进制转换
		 * public static String toBinaryString(int i)
		 * public static String toOctalString(int i)
		 * public static String toHexString(int i)
		 * 上面的看IntegerTest01；
		 * 
		 * 十进制到其他进制
		 * public static String toString(int i,int radix)
		 * 
		 * 其他进制到十进制
		 * public static int parseInt(String s,int radix)
		 */
		System.out.println(Integer.toString(100,10));
		System.out.println(Integer.toString(100,2));
		
		System.out.println(Integer.parseInt("100",10));
		System.out.println(Integer.parseInt("100",2));
		System.out.println("=============================");
		/*
		 * JDK5的新特性
		 * 自动装箱：把基本类型转换为包装类类型
		 * 自动拆箱：把包装类类型转换为基本类型
		 * 
		 * 注意一个小问题：
		 * 		在使用时，Integer  x = null;代码就会出现NullPointerException。
		 * 		建议先判断是否为null，然后再使用。
		 */
		 Integer i=100;
		 i+=20;
		 System.out.println("i:"+i);
         //上面两步可以用下面来解释
		// 通过反编译后的代码
		// Integer i = Integer.valueOf(100); //自动装箱
		// i = Integer.valueOf(i.intValue() + 200); //自动拆箱，再自动装箱
		// System.out.println((new StringBuilder("i:")).append(i).toString());

		Integer iii = null;
		// NullPointerException
		//System.out.println(iii+1);	
		System.out.println("==========================");
		
		/*
		 * 看程序写结果
		 * 
		 * 注意：Integer的数据直接赋值，如果在-128到127之间，会直接从缓冲池里获取数据
		 */
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println(i1 == i2);//false 
		System.out.println(i1.equals(i2));//true

		Integer i3 = new Integer(128);
		Integer i4 = new Integer(128);
		System.out.println(i3 == i4);//false
		System.out.println(i3.equals(i4));//true

		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5 == i6);//false
		System.out.println(i5.equals(i6));//true


		Integer i7 = 127;
		Integer i8 = 127;
		System.out.println(i7 == i8);//true
		System.out.println(i7.equals(i8));//true

		// 通过查看源码，我们就知道了，针对-128到127之间的数据，做了一个数据缓冲池，如果数据是该范围内的，每次并不创建新的空间
		// Integer ii = Integer.valueOf(127);
		
	}
}
