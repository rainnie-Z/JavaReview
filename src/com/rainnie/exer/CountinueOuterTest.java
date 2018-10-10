package com.rainnie.exer;
/**
 * @功能:打印101-199的素数
 * @author Rainnie
 *@时间:2018/7/10
 */
public class CountinueOuterTest {
	public static void main(String[] args) {
		int n = 0;
		outer:
		for(int i=101;i<=200;i+=2) {
			 for(int j=2;j<i;j++) {
				 if(i%j==0) {
					 continue outer;
				 }
			 }
			 System.out.print(i+"\t");
			 n++;
			 if(n<6)
				 continue;
			 System.out.println();
			 n=0;
		}
		 
	}
}
