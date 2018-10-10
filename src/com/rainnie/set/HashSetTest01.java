package com.rainnie.set;

import java.util.HashSet;
public class HashSetTest01 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("1hello");
		hs.add("2world");
		hs.add("3java");
		hs.add("2world");
		for (String s : hs) {
			System.out.println(s);
		}
	}
}
