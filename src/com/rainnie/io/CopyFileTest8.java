package com.rainnie.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 复制文本文件
 * 
 * 分析：
 * 		复制数据，如果我们知道用记事本打开并能够读懂，就用字符流，否则用字节流。
 * 		通过该原理，我们知道我们应该采用字符流更方便一些。
 * 		而字符流有5种方式，所以做这个题目我们有5种方式。推荐掌握第5种。
 * 数据源：
 * 		c:\\a.txt -- FileReader -- BufferdReader
 * 目的地：
 * 		d:\\b.txt -- FileWriter -- BufferedWriter
 */
public class CopyFileTest8 {
	public static void main(String[] args) throws IOException {
		method1("a.txt","b.txt");
		method2("a.txt","b.txt");
		method3("a.txt","b.txt");
		method4("a.txt","b.txt");
		method5("a.txt","b.txt");
		
	}

	public static void method5(String src, String dest) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(src));
		BufferedWriter bw=new BufferedWriter(new FileWriter(dest));
		String line=null;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
		
	}

	public static void method4(String src, String dest) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(src));
		BufferedWriter bw=new BufferedWriter(new FileWriter(dest));
		char[] chs=new char[1024];
		int len=0;
		while((len=br.read(chs))!=-1) {
			bw.write(chs, 0, len);
			bw.flush();
		}
		bw.close();
		br.close();
		
	}

	public static void method3(String src, String dest) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(src));
		BufferedWriter bw=new BufferedWriter(new FileWriter(dest));
		int ch=0;
		while((ch=br.read())!=-1) {
			bw.write(ch);
			bw.flush();
		}
		bw.close();
		br.close();
		
	}

	public static void method2(String src, String dest) throws IOException {
		 FileReader fr=new FileReader(src);
		 FileWriter fw=new FileWriter(dest);
		 char[] ch=new char[1024];
		 int len=0;
		 while((len=fr.read(ch))!=-1) {
			 fw.write(ch, 0, len);
		 }
		 fw.close();
		 fr.close();
	}

	public static void method1(String src, String dest) throws IOException {
		 FileReader fr=new FileReader(src);
		 FileWriter fw=new FileWriter(dest);
		 int ch=0;
		 while((ch=fr.read())!=-1) {
			 fw.write(ch);
		 }
		 fw.close();
		 fr.close();
	}
}
