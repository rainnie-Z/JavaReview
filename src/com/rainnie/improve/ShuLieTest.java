package com.rainnie.improve;

public class ShuLieTest {
	public static void main(String[] args) {
		int sum=0;
		 for(int i=1;i<=20;i++) {
			 sum+=fenzi(i)/fenmu(i);
		 }
		 System.out.println(sum);
		 /*float f1 = 1f;
			float f2 = 2f;
			float sum = 0;
			float temp = 0;

			for (int i = 0; i < 20; i++) {
				sum = sum + f2 / f1;
				temp = f1;
				f1 = f2;
				f2 = temp + f2;
			}

			System.out.println(sum);*/
	}

	private static int fenmu(int i) {
		if(i==1) {
			 return 1;
		 }else if(i==2) {
			 return 2;
		 }else {
			 return fenzi(i-1)+fenzi(i-2);
		 }
		 
	}

	private static int fenzi(int i) {
		 if(i==1) {
			 return 2;
		 }else if(i==2) {
			 return 3;
		 }else {
			 return fenzi(i-1)+fenzi(i-2);
		 }
		
	}
}
