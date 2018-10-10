package com.rainnie.trytest;
/**
 * char类型：
 * 		0-9--》48-57
 *      A--Z-->65-90
 * 		a--z—->97-122
 * @author Rainnie
 *
 */
public class Test01 {
	public static void main(String[] args) {
		for(char i='0';i<='9';i++) {
			System.out.print((int)i+" ");
		}
		System.out.println();
		for(char i='a';i<='z';i++) {
			System.out.print((int)i+" ");
		}
		System.out.println();
		for(char i='A';i<='Z';i++) {
			System.out.print((int)i+" ");
		}
	}
}
