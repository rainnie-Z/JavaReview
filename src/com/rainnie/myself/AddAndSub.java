package com.rainnie.myself;
/*
 * 100以内的奇数，偶数，总数和
 * Sn=n*a1+n(n-1)d/2或Sn=n(a1+an)/2
 */
public class AddAndSub {
	public static void main(String[] args) {
		int sum = 0,odds = 0,evens=0;
		for(int i=1;i<=100;i++) {
			odds=50+50*49;
			evens=100+50*49;
			sum=100*101/2;
		}
		System.out.println("odds:"+odds);
		System.out.println("evens:"+evens);
		System.out.println("sum:"+sum);
	}
}
