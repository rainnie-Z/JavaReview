package com.rainnie.collectin;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest03 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("杨过", "小龙女");
		map.put("郭靖", "黄蓉");
		map.put("杨康", "穆念慈");
		map.put("陈玄风", "梅超风");
		
		Set<String> set=map.keySet();
		for(String key:set) {
			String value=map.get(key);
			System.out.println(key + "---" + value);
		}
		
		System.out.println("----------------------");
		
		Set<Map.Entry<String,String>> set2=map.entrySet();
		for(Map.Entry<String, String> me:set2) {
			String key=me.getKey();
			String value=me.getValue();
			System.out.println(key + "---" + value);
		}
	}
}
