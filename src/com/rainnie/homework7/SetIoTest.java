package com.rainnie.homework7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIoTest {
	public static void main(String[] args) throws IOException {
		Set<Object> set=new HashSet<Object>();
		set.add("潍坊");
		set.add("宜春");
		set.add(888);
		set.add(111);
		set.add("北京");
		set.add(3.1415);
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("data.txt"));
		Iterator<Object> it=set.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			 if( obj instanceof String) {
				 bw.write("你插入了一个字符串:"+obj);
				 bw.newLine();
			 }
			 if( obj instanceof Integer){
				 bw.write("你插入了一个整数:"+obj);
				 bw.newLine();
			 }
			 if( obj instanceof Double) {
				 bw.write("你插入了一个小数:"+obj);
				 bw.newLine();
			 }
		}
		bw.close();
	}
}
