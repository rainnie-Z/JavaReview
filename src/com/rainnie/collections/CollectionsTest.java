package com.rainnie.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;


public class CollectionsTest {
	public static void main(String[] args) {
		 ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);
		list.add(20);
		System.out.println("list:"+list);
		// public static <T> void sort(List<T> list)：排序 默认情况下是自然顺序。
		Collections.sort(list);
		System.out.println("list:"+list);
		// public static <T> int binarySearch(List<?> list,T key):二分查找
		System.out.println("binarySearch:"+Collections.binarySearch(list,30));
		System.out.println("binarySearch:"+Collections.binarySearch(list,300));
		// public static <T> T max(Collection<?> coll):最大值
		System.out.println("max:"+Collections.max(list));
		// public static void reverse(List<?> list):反转
		Collections.reverse(list);
		System.out.println("reverse:"+list);
		//public static void shuffle(List<?> list):随机置换
		Collections.shuffle(list);
		System.out.println("list:" + list);
		
		 ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(55);
		list2.add(66);
		System.out.println("新列表:"+list2);
		Collections.copy(list, list2);
		System.out.println("拷贝后:"+list);
		System.out.println("列表中出现66的次数"+Collections.frequency(list, 66));
		System.out.println("列表中的最大值:"+Collections.max(list));
		System.out.println("列表中的最小值:"+Collections.min(list));
		
		Enumeration en=createDemoEnumeration();
		
		ArrayList list3=Collections.list(en);
		System.out.println("Enumeration->ArrayList:"+list3);
	}

	public static Enumeration createDemoEnumeration() {
		Vector v=new Vector();
		v.add("Tom");
		v.add("Billy");
		v.add("Jenny");
		return v.elements();
	}
}
