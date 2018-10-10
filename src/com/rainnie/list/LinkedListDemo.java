package com.rainnie.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		// 添加元素
		link.addFirst("hello");
		link.addFirst("world");
		link.addFirst("java");
		System.out.println("link:" + link);
		Iterator it = link.iterator();
		while(it.hasNext()) {
			String s=(String) it.next();
			System.out.println(s);
		}
		System.out.println("removeFirst:" + link.removeFirst());
		System.out.println("removeLast:" + link.removeLast());
		System.out.println("link:" + link);
}
}
