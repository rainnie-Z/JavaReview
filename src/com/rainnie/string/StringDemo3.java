package com.rainnie.string;

import java.util.Scanner;



public class StringDemo3 {
	public static void main(String[] args) {
		String username="rainnie";
		String password="123456";
		for(int x=0;x<3;x++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入用户名:");
			String name=sc.nextLine();
			System.out.println("请输入密码:");
			String pwd=sc.nextLine();
			if(name.equals(username)&&pwd.equals(password)) {
				System.out.println("登录成功,开始玩游戏");
				GuessNumberGame.start();
				break;
			}else {
				if((2-x)==0) {
					System.err.println("密码输入错误，锁定账号");
				}else {
					System.out.println("密码输入错误，还有"+(2-x)+"次机会");
				}
			}
		}
	}
}
