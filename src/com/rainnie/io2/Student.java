package com.rainnie.io2;

public class Student implements  Comparable<Student>{
	private String name;
	private int chinese;
	private int math;
	private int english;
	public Student() {
		super();
	}
	public Student(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	
	public int getScore() {
		return chinese+math+english;
		
	}
	@Override
	public int compareTo(Student s) {
		int num = this.getScore() - s.getScore();
		int num2 = num == 0 ? this.getChinese() - s.getChinese() : num;
		int num3 = num2 == 0 ? this.getMath() - s.getMath() : num2;
		int num4 = num3 == 0 ? this.getEnglish() - s.getEnglish() : num3;
		int num5 = num4 == 0 ? this.getName().compareTo(s.getName())
				: num4;
		return num5;
	}
}
