package com.rainnie.mytest;

public class TestDemo {
	private static int arr[] = new int[5];
	public static void main(String args[]) {
		/*SubSubClass  x = new  SubSubClass(10 , 20 , 30);
		x.show();*/

	for(int i=arr.length-1;i>=0;i--) {
	arr[i] = 2*i+1;
	}
	String output = "0";
	int sum = 0;
	
	for(int i=0;i<arr.length;i++){
	sum += arr[i];
	output += " + " + arr[i];
	}
	output += " = "+sum;
	System.out.println(output);
	System.exit(0);
	}
	
	
}
/*class	SuperClass{	
int	a,b;		
SuperClass(int aa , int	bb){
	a=aa;	b=bb;	
}
void	show( ){
System.out.println("a="+a+"	b="+b);
}
}
class	SubClass	extends	SuperClass{
int c;
SubClass(int	aa,int	bb,int	cc){
super(aa,bb);
c=cc;
}
}
class	SubSubClass   extends   SubClass{
int	a;
SubSubClass(int aa,int  bb,int	cc){
	super(aa,bb,cc);	
a=aa+bb+cc;	
}
void  show(){	
System.out.println("a="+a+"	b="+b+"  c="+c);
}
}*/


