package com.rainnie.collectin;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest02 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		Collection c2 = new ArrayList();
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");
		System.out.println("addAll:" + c1.addAll(c2));
		//只要有一个元素被移除了，就返回true。
		System.out.println("removeAll:"+c1.removeAll(c2));
		//只有包含所有的元素，才叫包含
		System.out.println("containsAll:"+c1.containsAll(c2));
		System.out.println("c1:" + c1);
		//boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?
		//假设有两个集合A，B。
		//A对B做交集，最终的结果保存在A中，B不变。
		//返回值表示的是A是否发生过改变。
		System.out.println("retainAll:"+c1.retainAll(c2));
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
	}
}
