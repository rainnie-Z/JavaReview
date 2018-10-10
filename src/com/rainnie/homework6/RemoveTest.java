package com.rainnie.homework6;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveTest {
	public static void main(String[] args) {
		Integer[] arrays= {333,33,3,1,11,111,2,22,222,3,33,333};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arrays.length;i++) {
			hs.add(arrays[i]);
		}
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			System.out.print(i+" ");
		}
	}
}
