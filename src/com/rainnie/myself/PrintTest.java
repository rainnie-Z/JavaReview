package com.rainnie.myself;
/*
 *              *****
				*****
				*****
				*****
				
		*
		**
		***
		****
		*****
		
		
		*****
		****
		***
		**
		*
		
		
		********
	  ********
	 ********
	********
   *********
 */
public class PrintTest {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			 for(int j=5;j>=i;j--) {
				 System.out.print("*");
			 }
			 System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--){
				System.out.print(" ");
			}
			for(int j=0;j<8;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
