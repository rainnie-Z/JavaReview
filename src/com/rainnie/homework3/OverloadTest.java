package com.rainnie.homework3;

public class OverloadTest {
	public static void main(String[] args) {
		AbsTest at=new AbsTest();
		System.out.println(at.abs(1));
		System.out.println(at.abs(1.0));
		System.out.println(at.abs(2.3f));
	}
}
class AbsTest{
	public int abs(int num) {
		return Math.abs(num);
	}
	public float abs(float num) {
		return Math.abs(num);
	}
	public double abs(double num) {
		return Math.abs(num);
	}
}
