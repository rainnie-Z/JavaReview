package com.rainnie.io2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class ScannerStudentTest {
	public static void main(String[] args) throws IOException {
		TreeSet<Student> ts=new TreeSet<Student>();
		for(int i=1;i<5;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("请录入第" + i + "个的学习信息");
			System.out.println("姓名：");
			String name=sc.nextLine();
			System.out.println("语文成绩：");
			int chinese=sc.nextInt();
			System.out.println("数学成绩：");
			int math=sc.nextInt();
			System.out.println("英语成绩：");
			int english=sc.nextInt();
			
			Student s=new Student();
			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);
			ts.add(s);
		}
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		bw.write("学生信息如下：");
		bw.newLine();
		bw.flush();
		bw.write("姓名,语文成绩,数学成绩,英语成绩");
		bw.newLine();
		bw.flush();
		for(Student s:ts) {
			StringBuilder sb = new StringBuilder();
			sb.append(s.getName()).append(":").append(s.getChinese()).append(" ").append(s.getMath())
			.append(" ").append(s.getEnglish());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
		
		
	}
}
