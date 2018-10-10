package com.rainnie.map;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 * LinkedHashMap:是Map接口的哈希表和链接列表实现，具有可预知的迭代顺序。
 * 由哈希表保证键的唯一性
 * 由链表保证键盘的有序(存储和取出的顺序一致)
 */
public class LinkedHashMapTest01 {
	public static void main(String[] args) {
		LinkedHashMap<String,String> lhm=new LinkedHashMap<String,String>();
		lhm.put("2345", "hello");
		lhm.put("1234", "world");
		lhm.put("3456", "java");
		lhm.put("1234", "javaee");
		lhm.put("3456", "android");
		
		Set<String> set=lhm.keySet();
		for(String key:set) {
			String value=lhm.get(key);
			System.out.println(key+"---"+value);
		}
		

	}
}
