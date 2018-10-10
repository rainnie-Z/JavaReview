package com.rainnie.collectin;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest01 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("邓超", "孙俪");
		map.put("黄晓明", "杨颖");
		map.put("周杰伦", "昆凌");
		map.put("刘恺威", "杨幂");
		System.out.println("size:"+map.size());
		System.out.println("map:" + map);
		System.out.println("-------------------------");
		System.out.println(map.get("周杰伦"));
		System.out.println(map.get("周杰"));
		System.out.println("-------------------------");
		
		// Set<K> keySet():获取集合中所有键的集合
		Set<String> set=map.keySet();
		for(String key:set) {
			System.out.println(key);
		}
		System.out.println("----------------------------");
		
		// Collection<V> values():获取集合中所有值的集合
		Collection<String> con=map.values();
		for(String value:con) {
			System.out.println(value);
		}
	}
}
