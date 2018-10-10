package com.rainnie.improve;
/**
 * @功能:5	一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，
 *          求它在第10次落地时，共经过多少米？第10次反弹多高？
 * @author Rainnie
 * @时间:2018/7/10
 *
 */
public class BallTest {
	public static void main(String[] args) {
		/* double sum1=0,sum2=0,height=100;
		 for(int i=0;i<10;i++) {
			 sum1=sum1+height;
			 height=height/2;
			 if(i<9) {
				 sum2=sum2+height;
			 }
		 }
		 System.out.println("第10次落地时，共经过" + (sum1 + sum2) + "米");
	     System.out.println("第十次反弹高度为" + height + "米");*/
		/*double h = 100;
		// 第一次反弹反弹高度,并用该变量记录每次反弹的高度
		double hf = h / 2;
		int i = 0;
		for (i = 2; i <10; i++) {
			h = h + hf * 2; // 第i次落地经过多少米
			hf = hf / 2;// 第i次反弹的高度
		}

		System.out.println("第" + i + "次落地经过" + h + "米");//0.1953125
		System.out.println("第" + i + "次反弹" + hf + "米");//299.21875
*/		
		double sum=100,height=100;
		for(int i=1;i<=9;i++)//计算第一次落地到第九次落地再弹起小球经过多少米
		{
		height=height/2;
		sum=sum+height*2;
		}//循环结束，小球第十次落地
		height=height/2;//第十次弹起的高度，按题意此时不再计算
		System.out.println("第十次落地时的高度是："+height+"\n小球共经过："+sum+"米");
  		 
	}
}
