package com.rainnie.homework;
/**@功能:打印下面的图形
   *
  ***
 *****
*******
 *****
  ***
   *
 * @author Rainnie
 *@时间：2018/7/9
 */
/*
 * 分析:
        n:总行数(上面多的一部分的行数） 
		i:行数
		
		上半部：n层
		       每行的*数量: 2*i-1
		       每行的空格的数量: n -i
		       
		下半部：n-1层
		      每行的空格数： i
		       每行的*数量:2*(n-i)-1

 */
public class PrintTest {
	public static void main(String[] args) {
		int n=4;
		
		for(int i=1;i<=n;i++) {
			for(int a=1;a<=n-i;a++) {
				System.out.print(" ");
			}
			for(int b=1;b<=2*i-1;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n-1;i++) {
			for(int a=1;a<=i;a++) {
				System.out.print(" ");
			}
			for(int b=1;b<=2*(n-i)-1;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
