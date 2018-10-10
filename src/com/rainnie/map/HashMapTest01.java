package com.rainnie.map;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest01 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("001","张三");
		hm.put("002","李四");
		hm.put("003","王二");
		hm.put("001","赵五");
		
		Set<String> set=hm.keySet();
		for(String key:set) {
			String value=hm.get(key);
			System.out.println(key+"----"+value);
		}
	}
}
