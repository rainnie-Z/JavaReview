package com.rainnie.myself3;
/*
 * 为了让父类中的方法不被子类重写，可以在父类该方法加上final修饰
 * 
 */
public class FinalDemo3 {
	public static void main(String[] args) {
		Zi7 z = new Zi7();
		z.show();
	}
}
class Fu7{
	public  final void show() {
		System.out.println("fu show");
	}
}

class Zi7 extends Fu7 {
	// Zi中的show()无法覆盖Fu中的show()
	/*public void show() {
		System.out.println("zi show");
	}*/
}

