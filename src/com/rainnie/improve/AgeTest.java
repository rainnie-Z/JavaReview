package com.rainnie.improve;

public class AgeTest {
	public static void main(String[] args) {
		System.out.println(age(5));
	}

	private static int age(int i) {
		if(i==1) {
			return 10;
		}else {
			return age(i-1)+2;
		}
		 
	}
}
