package com.rainnie.homework5;

import java.util.Scanner;

public class Game3 {
	Person person;
	Computer computer;
	int count;
	
	public void initial() {
		person = new Person();
    	computer = new Computer();
    	count = 0;
	}
	
	public void startGame() {
		initial();
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

		/*开始游戏*/
		System.out.print("\n要开始吗？（y/n） ");
		String con = sc.next();
		int perFist;   //用户出的拳
		int compFist;  //计算机出的拳
		while(con.equals("y")) {
			perFist=person.showFist();
			compFist = computer.showFist();
			if((perFist == 1 && compFist == 1) || (perFist == 2 && compFist == 2) || (perFist == 3 && compFist == 3)){
				System.out.println("结果:和局,真衰！\n");  //平局
			}else if((perFist == 1 && compFist == 3) || (perFist == 2  && compFist == 1) || (perFist == 3 && compFist == 2)){
				System.out.println("结果： 恭喜， 你赢了！");  //用户赢				
			}else{
				System.out.println("结果说:^_^,你输了，真笨!\n");  //计算机赢				
			}
			count++;
			System.out.print("\n是否开始下一轮（y/n）:  ");
			con = sc.next();
		}
	}
}
