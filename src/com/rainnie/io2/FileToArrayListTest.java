package com.rainnie.io2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayListTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("a.txt"));
		ArrayList<String> arrays=new ArrayList<String>();
		String line=null;
		while((line=br.readLine())!=null) {
			arrays.add(line);
		}
		br.close();
		for(String s:arrays) {
			System.out.println(s);
		}
	}
}
