package com.rainnie.exer2;

public class VehicleTest {
	public static void main(String[] args) {
		 Bus b=new Bus();
		 b.setName("公共汽车");
		 b.setWheel(4);
		 b.setCoinNum(32);
		 System.out.println("交通工具名:"+b.getName()+"\n车轮数:"+b.getWheel()+"\n投币箱的投币数:"+b.addCoin(53));
	}
}
class Vehicle{
	private int wheel;
	private String name;
	public Vehicle() {
	}
	public Vehicle(int wheel, String name) {
		this.wheel = wheel;
		this.name = name;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class Bus extends Vehicle{
	private int coinNum;

	public Bus() {
		 
	}

	public Bus(int wheel, String name) {
		super(wheel, name);
	}

	public int getCoinNum() {
		return coinNum;
	}

	public void setCoinNum(int coinNum) {
		this.coinNum = coinNum;
	}
	public int addCoin(int addCoin) {
		return coinNum+addCoin*2;
		
	}
	
}