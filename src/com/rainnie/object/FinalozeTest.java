package com.rainnie.object;

public class FinalozeTest {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Person3 p=new Person3("Tom"+i);
			for(int j=0;j<10000;j++) {
				String[] test=
					{new String("Asdf"),
				     new String("Billy"),
				     new String("Kessy")
					};
			}
			p=null;
			System.gc();
		}
	}
}
class Person3{
	private String name;

	public Person3(String name) {
		this.name = name;
		System.out.println("创建Person对象，name:"+name);
	}
	public void finalize() {
		System.out.println("销毁Person对象,name:"+name);
	}
	
}
