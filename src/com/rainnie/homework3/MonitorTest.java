package com.rainnie.homework3;

public class MonitorTest {
	public static void main(String[] args) {
		CrtMonitor cm=new CrtMonitor("海信",712);
		cm.display();
	
		LcdMonitor lm=new LcdMonitor("TCL", 2313);
		lm.display();
		lm.hDDisplay();
	}
}
class Monitor{
	String brand;
	int price;
	public Monitor(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public void display() {
		System.out.println("显示器显示了");
	}
	
}
class CrtMonitor extends Monitor{

	public CrtMonitor(String brand, int price) {
		super(brand, price);
	}
	public void display() {
		System.out.println(brand+"电视，"+price+"元,"+"显像管显示器，显示效果较好");
	}
	
}
class LcdMonitor extends Monitor{

	public LcdMonitor(String brand, int price) {
		super(brand, price);
	}
	public void display() {
		System.out.println(brand+"电视，"+price+"元,"+"液晶显示器，显示效果清晰");
	}
	public void hDDisplay() {
		System.out.println("液晶显示器具有高清显示效果，屏幕刷新率高");
	}
	
}
