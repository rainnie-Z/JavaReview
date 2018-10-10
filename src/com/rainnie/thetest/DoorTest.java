package com.rainnie.thetest;
/*
 * @功能:利用继承、抽象类、接口的知识设计一个门类
 * @开发者：Rainnie
 * @创建时间:2018/7/21
 */
public class DoorTest {
	public static void main(String[] args) {
		MyDoor md=new MyDoor();
		md.setName("super door");
		System.out.println(md.getName());
		md.openDoor();
		md.closeDoor();
		md.theftproof();
		md.bulletproof();
		md.waterproof();
	}
}

/*
 * 抽象门Door
 */
abstract class Door{
	//开门openDoor()
	public abstract void openDoor();
	//关门closeDoor() 
	public abstract void closeDoor();
}

/*
 * 另外的功能设计
 */
interface Function{
	//防盗
	public abstract void theftproof();
	//防水
	public abstract void waterproof();
	//防弹
	public abstract void  bulletproof();
}

class MyDoor extends Door implements Function{
	private String name;
	
	public MyDoor() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void theftproof() {
		System.out.println("可以防盗");
		
	}

	@Override
	public void waterproof() {
		System.out.println("可以防水");
		
	}

	@Override
	public void bulletproof() {
		System.out.println("可以防子弹");
		
	}

	@Override
	public void openDoor() {
		System.out.println("我的门肯定能打开啊");
		
	}

	@Override
	public void closeDoor() {
		System.out.println("我的门肯定能关啊");
		
	}

	 
}