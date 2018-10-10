package com.rainnie.myself3;
/*
 * 孔子装爹
 */
public class DuoTaiTest4 {
	public static void main(String[] args) {
		/*Java培训特别火,很多人来请孔子爹去讲课，这一天孔子爹被请走了
		 * 但是还有人来请，就剩孔子在家，价格还挺高。孔子一想，我是不是可以考虑去呢?
		 * 然后就穿上爹的衣服，带上爹的眼睛，粘上爹的胡子。就开始装爹
		 */
		//向上转型
		KongziDie kd=new Kongzi();
		//到人家那里去了
		System.out.println(kd.age);//40
		kd.teach();//讲解论语
		//kd.playGame,这才是儿子做的
		
		/*
		 * 讲完了，下班回家了,脱下爹的装备，换上自己的装备
		 */
		//向下转型
		Kongzi k=(Kongzi)kd;
		System.out.println(k.age);//20
		k.teach();//讲解论语
		k.playGame();//英雄联盟
	}
}
class KongziDie{
	public int age=40;
	public void teach() {
		System.out.println("讲解JavaSE");
	}
}
class Kongzi extends KongziDie{
	public int age=20;
	public void teach() {
		System.out.println("讲解论语");
	}
	public void playGame() {
		System.out.println("英雄联盟");
	}
	 
	

}
