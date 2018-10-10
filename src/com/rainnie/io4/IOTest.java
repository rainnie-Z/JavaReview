package com.rainnie.io4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest {
	public static void main(String[] args) {
		String str="";
		int i=0;
		try {
			BufferedReader keyIn=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt"));
			BufferedReader br=new BufferedReader(new FileReader("b.txt"));
			System.out.println("请输出信息:");
			while(!(str=keyIn.readLine()).equals("exit")) {
				bw.write(str, 0, str.length());
				bw.newLine();
				bw.flush();
			}
			keyIn.close();
			bw.close();
			while((str=br.readLine())!=null) {
				i++;
				System.out.println(i+":"+str);
			}
			br.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
