package com.rainnie.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
 * // Set<K> keySet():获取集合中所有键的集合
 * // Collection<V> values():获取集合中所有值的集合
 */
public class MapTest01 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("吴承恩","西游记");
		map.put("施耐庵","水浒传");
		map.put("曹雪芹","红楼梦");
		map.put("罗贯中","三国演义");
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get("吴承恩"));
		System.out.println(map.get("吴承仇"));
		System.out.println("-----------------------------");
		
		Set<String> set=map.keySet();
		for(String key:set) {
			System.out.println(key);
		}
		
		System.out.println("------------------------");
		Collection<String> c=map.values();
		for(String values:c) {
			System.out.println(values);
		}
		
		System.out.println("------------------");
		
		for(String key:set) {
			String values=map.get(key);
			System.out.println(key+"---"+values);
		}
		
		System.out.println("------------------------");
		
		Set<Map.Entry<String, String>> set2=map.entrySet();
		for(Map.Entry<String, String> s:set2) {
			System.out.println(s.getKey()+"---"+s.getValue());
		}
		
	}
}
