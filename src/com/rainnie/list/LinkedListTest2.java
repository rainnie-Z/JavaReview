package com.rainnie.list;

import java.util.LinkedList;

public class LinkedListTest2 {
	public static void main(String[] args) {
		MyStack ms=new MyStack();
		ms.add("hello");
		ms.add("world");
		ms.add("java");
		while(!ms.isEmpty()) {
			System.out.println(ms.get());
		}
	}
}
class MyStack{
	private LinkedList link;

	public MyStack() {
		link=new LinkedList();
	}
	public void add(Object obj) {
		link.addFirst(obj);
	}
	public Object get() {
		return link.removeFirst();
	}
	public boolean isEmpty() {
		return link.isEmpty();
	}
	
	
}
