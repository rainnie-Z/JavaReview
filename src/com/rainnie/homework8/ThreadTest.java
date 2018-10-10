package com.rainnie.homework8;

import java.util.ArrayList;
import java.util.Collections;

public class ThreadTest {
	public static void main(String[] args) {
		Word w=new Word();
		Number n=new Number();
		w.start();
		n.start();
		 
	}
}
class Word extends Thread{
	ArrayList<Character> list=new ArrayList<Character>();
	@Override
	public void run() {
		for(char c ='A';c <='Z';c++){
			list.add(c);
		}
		Collections.shuffle(list);
		for(Character c:list) {
			System.out.print(c+",");
		}
	} 
			 	 
		 
}

class Number extends Thread{
    ArrayList<Integer> list=new ArrayList<Integer>();
	@Override
	public void run() {
			 for(int i = 1;i <= 26;i++){
				 list.add(i);
	        }
			Collections.shuffle(list);
			for(Integer i:list) {
				System.out.print(i+",");
			}
	}
}
