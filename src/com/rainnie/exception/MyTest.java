package com.rainnie.exception;

public class MyTest {
	public static void main(String[] args) {
		A tst=new A();
		tst.work(null);
	}
}
class A{
	public void work(int[] a) {
		String s=this.cotain(a,3);
		System.out.println("Result:"+s);
	}

	public String cotain(int[] source, int index) {
		String result="no!";
		try {
			for(int i=0;i<source.length;i++) {
				if(source[i]==index) {
					result="yes!";
				}
			}
		}catch (Exception e) {
			 System.out.println("异常信息:"+e.getMessage());//e.getMessage();
			 System.out.println("运行栈信息:");
			 e.printStackTrace();//e.printStackTrace();
			 result="error!";
		}
		return result;
	}
}