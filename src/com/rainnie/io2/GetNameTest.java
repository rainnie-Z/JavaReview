package com.rainnie.io2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class GetNameTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("b.txt"));
		ArrayList<String> arrays=new ArrayList<String>();
		String line=null;
		while((line=br.readLine())!=null) {
			arrays.add(line);
		}
		br.close();
		
		//随机访问
		Random r=new Random();
		//返回伪随机的，均匀分布 int值介于0（含）和指定值（不包括），从该随机数生成器的序列绘制。 
		int index=r.nextInt(arrays.size());
		
		String name=arrays.get(index);
		System.out.println(name);
	}
}
