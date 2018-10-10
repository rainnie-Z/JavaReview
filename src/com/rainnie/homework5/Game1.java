package com.rainnie.homework5;

import java.util.Scanner;

public class Game1 {
	Person person;
	Computer computer;
	int count;
	public void init() {
		person=new Person();
		computer=new Computer();
		count=0;
	}
	public void startGame() {
		init();
		System.out.println("----------------欢 迎 进 入 游 戏 世 界----------------\n");
		System.out.println("\n\t\t******************");
		System.out.println  ("\t\t**  猜拳, 开始    **");
		System.out.println  ("\t\t******************");
		
		System.out.println("\n\n出拳规则：1.剪刀 2.石头 3.布");
		/*选择对方角色*/
		System.out.print("请选择对方角色（1：刘备 2：孙权 3：曹操）： ");
		Scanner sc=new Scanner(System.in);
		int role=sc.nextInt();
		if(role==1) {
			computer.name="刘备";
		}else if(role==2) {
			computer.name="孙权";
		}else if(role==3) {
			computer.name="曹操";
		}
		System.out.println("你选择了和"+computer.name+"对战");
	}
}
