package com.rainnie.collections;

import java.util.ArrayList;
import java.util.Collections;

public class PokerTest01 {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		String[] colors= {"♥","♠","♦","♣"};
		String[] numbers= {"A","2","3","4","5","6","7","8","9","10","J","Q","k"};
		for(String color:colors) {
			for(String number:numbers) {
				array.add(color.concat(number));
			}
		}
		array.add("小王");
		array.add("大王");
		
		Collections.shuffle(array);
		ArrayList<String> player1=new ArrayList<String>();
		ArrayList<String> player2=new ArrayList<String>();
		ArrayList<String> player3=new ArrayList<String>();
		ArrayList<String> bosscards=new ArrayList<String>();
 		
		for(int x=0;x<array.size();x++) {
			if(x>=array.size()-3) {
				bosscards.add(array.get(x));
			}else if(x%3==0) {
				player1.add(array.get(x));
			}else if(x%3==1) {
				player2.add(array.get(x));
			}else if(x%3==2) {
				player3.add(array.get(x));
			}
		}
		
		lookPoker("玩家一号",player1);
		lookPoker("玩家二号",player2);
		lookPoker("玩家三号",player3);
		lookPoker("底牌",bosscards);
 	}

	public static void lookPoker(String name, ArrayList<String> cards) {
		 System.out.println(name+"的牌是:");
		 for(String s:cards) {
			 System.out.print(s+" ");
		 }
		 System.out.println();
		
	}
}
