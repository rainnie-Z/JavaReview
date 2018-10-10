package com.rainnie.exer2;

public class SingleTest {
	public static void m1(){
		Single s2 = Single.getSingle();
		System.out.println(s2.getName());
		}
		public static void main(String args[]) {
		Single s1 = Single.getSingle();
		s1.setName("Tom");
		m1();
		}

}
class Single{
	/*
	 * 饿汉式
	 */
	private String name;
	private static Single onlyone=new Single();
	private Single() {
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public static Single getSingle() {
		return onlyone;
	}
}

class Single2{
	/*
	 * 懒汉式
	 */
	private String name;
	private static Single2 onlyone=null;
	private Single2() {
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public static Single2 getSingle() {
		if(onlyone==null) {
			onlyone=new Single2();
		}
		return onlyone;
	}
}
