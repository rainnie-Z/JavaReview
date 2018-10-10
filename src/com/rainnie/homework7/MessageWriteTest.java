package com.rainnie.homework7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class MessageWriteTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new FileWriter("personInfo.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("personInfo.txt"));
		String line=null;
		char i='A';
		System.out.println("请输入个人信息:");
		while(!(line=br.readLine()).equals("exit")) {
			bw.write(line,0,line.length());
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
		while((line=br2.readLine())!=null) {
			System.out.println(i+")"+line);
			i++;
		}
		br2.close();
	}
}
