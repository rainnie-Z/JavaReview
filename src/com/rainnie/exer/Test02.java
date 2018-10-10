package com.rainnie.exer;

public class Test02 {
	public static void main(String[] args) {
		/*int x=1;
		if(x>4){
			System.out.println("Test 1");
			}else if (x>9){
			System.out.println("Test 2");
			}else {
			System.out.println("Test 3");
			}*/
		int n = 0;
		outer:
		for(int i=101;i<200;i+=2){
		for(int j=2; j<i;j++){
		if(i%j==0)
		continue outer;
			 
		}
		System.out.print(i + "\t");
		n++;
		if(n<6 )
		continue;
		System.out.println();
		n = 0;
		}
	}
}
