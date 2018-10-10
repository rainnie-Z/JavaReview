package com.rainnie.exer;

public class ArrayTest06 {
	 public static void main(String[] args) {
		 MyDate[] m=new MyDate[10];
		 for(int i=0;i<10;i++) {
			 m[i]=new MyDate(i+1,i+1,1900+i);
			/* m[i].display();*/
		 }
		 for(MyDate s:m) {
			 s.display();
		 }
	 }
}
