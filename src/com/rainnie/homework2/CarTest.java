package com.rainnie.homework2;

public class CarTest {
	public static void main(String[] args) {
		 KaCar car1=new KaCar();
		 KeCar car2=new KeCar();
		 car1.setSpeed(50);
		 car1.setWeight(12);
		 car2.setSpeed(81.5);
		 car2.setWeight(8);
		 int s=2100;
		 int t1=s/car1.getSpeed();
		 int t2=(int) (s/car2.getSpeed())+10;
		 if(t1>t2) {
			 System.out.println("客车先到达");
		 }else {
			 System.out.println("卡车先到达");
		 }
		 System.out.println("卡车花费"+t1+"小时");
		 System.out.println("汽车花费"+t2+"小时");
		  
	}
}
