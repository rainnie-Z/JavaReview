package com.rainnie.exer;
/**
 * @功能：计算并显示46天是几周零几天
 * @author Rainnie
 * @时间：2012/7/9
 *
 */
public class WeekTest {
	public static void main(String[] args) {
		int days=46;
		int weekend=days/7;
		int day=days%7;
		System.out.println("46天是第"+weekend+"周零"+day+"天");
	}
}
