package com.rainnie.collectin;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("hello");
		c.add("java");
		//c.clear();
		System.out.println("remove:" + c.remove("hello"));
		System.out.println("contains:"+c.contains("hello"));
		System.out.println("isEmpty:"+c.isEmpty());
		System.out.println("size:"+c.size());
		System.out.println("c:" + c);
	}
}
