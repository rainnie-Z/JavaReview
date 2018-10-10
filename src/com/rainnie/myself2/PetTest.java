package com.rainnie.myself2;

public class PetTest {
	public static void main(String[] args) {
	 Pet p=new Pet();
	 System.out.println(p.print());
	 Dog d=new Dog();
	 d.setName("阿黄");
	 d.setHealth(15);
	 d.setLove(40);
	 d.setStrain("牧羊犬");
	 System.out.println(d.print());
	 Penguin pg=new Penguin();
	 pg.setName("Q仔");
	 pg.setHealth(40);
	 pg.setLove(95);
	 pg.setSex("母");
	 System.out.println(pg.print());
	}
}
