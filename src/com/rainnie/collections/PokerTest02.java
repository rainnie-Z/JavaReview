package com.rainnie.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerTest02 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		ArrayList<Integer> array=new ArrayList<Integer>();
		String[] colors= {"♥","♠","♦","♣"};
		String[] numbers= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		int index=0;
		for(String number:numbers) {
			for(String color:colors) {
				hm.put(index,color.concat(number));
				array.add(index);
				index++;
			}
		}
		hm.put(index,"小王");
		array.add(index);
		index++;
		hm.put(index,"大王");
		array.add(index);
		
		Collections.shuffle(array);
		
		TreeSet<Integer> player1=new TreeSet<Integer>();
		TreeSet<Integer> player2=new TreeSet<Integer>();
		TreeSet<Integer> player3=new TreeSet<Integer>();
		TreeSet<Integer> bosscards=new TreeSet<Integer>();
		
		for(int x=0;x<array.size();x++) {
			if(x>=array.size()-3) {
				bosscards.add(array.get(x));
			}else if(x%3==0) {
				player1.add(array.get(x));
			}else if(x%3==1){
				player2.add(array.get(x));
			}else if(x%3==2) {
				player3.add(array.get(x));
			}
		}
		
		lookPoker("玩家一号",player1,hm);
		lookPoker("玩家二号",player2,hm);
		lookPoker("玩家三号",player3,hm);
		lookPoker("底牌", bosscards,hm);
	}

	public static void lookPoker(String name, TreeSet<Integer> ts,HashMap<Integer, String> hm) {
		System.out.print(name + "的牌是：");
		for (Integer key : ts) {
			String value = hm.get(key);
			System.out.print(value + " ");
		}
		System.out.println();
		
	}
}
