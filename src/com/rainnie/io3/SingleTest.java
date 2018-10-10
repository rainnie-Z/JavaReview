package com.rainnie.io3;
/*
 * @功能:单例设计模式
 * @开发者:Rainnie
 * @创建时间:2018/7/21
 */
public class SingleTest {
	public static void main(String args[]) {
		Single s1 = Single.getInstance();
	    s1.setName("Test");
	    showName();
	}

	public static void showName() {
		Single s2 = Single.getInstance();
		System.out.println(s2.getName());
	}
}
/*
 * 饿汉式
 */
class Single{
	private String name;
	private static Single instance=new Single();

	public Single() {
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public static Single getInstance() {
		return instance;	
	}	
	public void showMessage(){
	      System.out.println("Hello World!");
	 }
}

/*
 * 懒汉式
*/
class Single2{
	private static Single2 instance;

	public Single2() {
		
	}
	
	public static Single2 getInstance(){
		if(instance==null) {
			instance=new Single2();
		}
		return instance;
		
	}
	
}