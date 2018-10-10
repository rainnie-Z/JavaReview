package com.rainnie.homework;
/**
 * @功能:1、2、3、4个数字，组成互不相同且无重复数字的三位数且打印出来
 * @author Rainnie
 * @时间：2018/7/9
 *
 */
public class ArrayNumberTest {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				for(int k=1;k<=4;k++) {
					if(i!=j&&j!=k&&i!=k) {
						int result=i*100+j*10+k*1;
						count++;
						System.out.print(result+" ");
						if(count%5==0) {
							System.out.println();
						}
					}
				}
			}	 
		}
		System.out.println();
		System.out.println("如上所示：总共有"+count+"种不同的数字");
	}
}
