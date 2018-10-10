package com.rainnie.myself;
/**
 * @功能:猜数字游戏
 * @author Rainnie
 * @时间:2018/7/11
 */
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int number = (int)(Math.random()*100)+1;
		System.out.println("猜数字:");
		int count = 0;
		while(true) {
			Scanner sc=new Scanner(System.in);
			int gNum=sc.nextInt();
			count++;
			if(gNum>number) {
				System.out.println("你猜的数大了，再猜一次");
			}else if(gNum<number) {
				System.out.println("你猜的数字小了，再猜一次");
			}else {
				System.out.println("恭喜，猜对了,猜了"+count+"次");
				break;
			}
			 
		}
	}
}
