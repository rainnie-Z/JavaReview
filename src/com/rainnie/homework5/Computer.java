package com.rainnie.homework5;

public class Computer {
	String name="电脑";
	int score=0;
	
	public int showFist() {
		int show=(int) (Math.random()*3+1);
		switch(show) {
		case 1:
			System.out.println(name+"出拳:剪刀");
			break;
		case 2:
			System.out.println(name+"出拳:石头");
			break;
		case 3:
			System.out.println(name+"出拳:布");
			break;
		}
		return show;
	}
}
