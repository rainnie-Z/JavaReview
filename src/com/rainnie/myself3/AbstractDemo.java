package com.rainnie.myself3;
/*
 * 抽象类和抽象方法必须用abstract关键字修饰
 * 抽象类中不一定有抽象方法,但是有抽象方法的类必须定义为抽象类
 * 抽象类不能实例化
 * 抽象类有构造方法，但是不能实例化,用于子类访问父类数据的初始化
 * 抽象类的实例化其实是靠具体的子类实现的。是多态的方式
 */
public class AbstractDemo {
	public static void main(String[] args) {
		//创建对象
		//Animal是抽象的; 无法实例化
		//Animal a = new Animal();
		//通过多态的方式
		Animal3 a = new Cat3();
		a.eat();
	}
}
abstract class Animal3{
	//public abstract void eat() {}//空方法体,这个会报错。抽象方法不能有主体
	public abstract void eat();
	public Animal3() {}
}
//子类是抽象类
abstract class Dog3 extends Animal3{}

//子类是具体类，重写抽象方法
class Cat3 extends Animal3{

	@Override
	public void eat() {
		 System.out.println("猫吃鱼");
		
	}
	
}

