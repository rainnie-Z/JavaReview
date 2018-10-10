package com.rainnie.io3;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterTest2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(new FileWriter("b.txt"));
		String line=null;
		System.out.println("请输入信息:");
		while(!(line=br.readLine()).equals("exit")) {
			pw.println(line);
		}
		br.close();
		pw.close();
	}
}
