package com.rainnie.myself3;
/*
 * 接口不能实例化，只能按照多态的方式实例化
 * 接口的子类为抽象类意义不大，为具体类，则要重写接口中所有的抽象方法
 * 
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		//AnimalTrain是抽象的; 无法实例化
		//AnimalTrain at=new AnimalTrain();
		
		AnimalTrain at=new Cat6();
		at.jump();
	}
}
interface AnimalTrain{
	public abstract void jump();
}
abstract class Dog6 implements AnimalTrain{
	
}
class Cat6 implements AnimalTrain{

	@Override
	public void jump() {
		 System.out.println("猫可以跳高");
		
	}
	
}
