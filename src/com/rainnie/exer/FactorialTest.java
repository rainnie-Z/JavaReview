package com.rainnie.exer;

public class FactorialTest {
	public static void main(String[] args) {
		System.out.println(factorials(5)); 
	}

	public static int factorials(int n) {
		int sum=0;  
		int num=1;
		for(int i=1;i<=n;i++) {
			num*=i;                 
			sum+=num;  
			System.out.println(num+"  "+sum);
		}
		return sum;
		
	}
}
