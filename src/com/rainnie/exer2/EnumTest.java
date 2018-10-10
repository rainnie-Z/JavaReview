package com.rainnie.exer2;
/*
 * 枚举类型
 */
public class EnumTest {
	public static void main(String[] args) {
		EnumTest et=new EnumTest();
		et.work(Week.Sun);
		EnumTest et2=new EnumTest();
		et2.work2(Week.Fri);
	}
	public void work(Week day){
		if(day.equals(Week.Sat)) {
			System.out.println("Shopping");
		}else if(day.equals(Week.Sun)) {
			System.out.println("Prayying");
		}else {
			System.out.println("Working");
		}
	}
	public void work2(Week day) {
		switch(day) {
		case Mon:
		case Tue:
		case Wed:
		case Thu:
		case Fri:
			System.out.println("工作日");
			break;
		case Sat:
			System.out.println("购物日");
			break;
		case Sun:
			System.out.println("祈祷日");
			break;
		default:
			System.out.println("搞错了吧？");
		}
	}
}
enum Week{
	Mon,Tue,Wed,Thu,Fri,Sat,Sun
}
