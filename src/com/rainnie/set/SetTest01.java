package com.rainnie.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("hello");
		set.add("java");
		set.add("world");
		set.add("java");
		set.add("world");
		for(String s:set) {
			System.out.println(s);
		}
	}
}
