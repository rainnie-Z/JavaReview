package com.rainnie.thetest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * @功能:字符串求"yekmaakkccekymbvb",有多少种字符以及每个字符的个数
 * @开发者:Rainnie
 * @创建时间:2018/7/21
 */
public class StringTest {
	public static void main(String[] args) {
		/*String str = "yekmaakkccekymbvb";
		int count=0;
        while (!"".equals(str)) {
            String s = str.substring(0,1);//每次取字符串的第一个
            String tempS = str.replace(s,"");//将该字符串中与第一个相同的全部去掉
            System.out.print(s + ":" + (str.length() - tempS.length())+" ");//得到去掉的个数
            str = tempS;
            count++;
        }
        System.out.println();
        System.out.println("共有"+count+"种字符");*/
		/*String s = "yekmaakkccekymbvb";
        Map<Character,Integer> result = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(result.get(ch) != null){
                result.put(ch,result.get(ch)+1);
            }else{
                result.put(ch,1);
            }
        }
      */
		String s="yoioewtetewfww";
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.get(ch)!=null) {
				map.put(ch,map.get(ch)+1);
			}else {
				map.put(ch,1);
			}
		}
		Set<Character> set=map.keySet();
		for(Character key:set) {
			Integer value=map.get(key);
			System.out.println(key+"--"+value);
		}

	}

	 
}
