package com.rainnie.exer;
/**
 * @功能:计算出 87-307之间有多少个质数，显示输出这些数，每行9个同时计算出这些质数之和
 * @author Rainnie
 * @时间:2018/7/10
 */
public class CountinueOuterTest2 {
	public static void main(String[] args) {
		int n=0;
		int sum=0;
		outer:
		for(int i=87;i<=307;i+=2) {
			for(int j=2;j<i;j++) {
				if(i%j==0)
					continue outer;
			}
			System.out.print(i+"\t");
			sum=sum+i;
			n++;
			if(n<9)
				continue;
			System.out.println();
			n=0;
		}
		System.out.println();
		System.out.println("这些质数的和是:"+sum);
	}
}
