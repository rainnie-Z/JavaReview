package com.rainnie.homework7;

public class MyExcptionTest {
	public static void main(String[] args) {
		MyExcptionTest mt=new MyExcptionTest();
		mt.showbalance();
	}

	public void showbalance() {
		 try {
			 account(-1200);
		 }catch(MyException e){
			 System.out.println("余额输入有误，错误编码:"+e.getId());
			 System.out.println(e.getMessage());
		 }
		System.out.println("本次登记操作结束");
	}

	public void account(int balance) throws MyException{
		 if(balance<0) {
			throw new MyException("账户异常，余额不能为负",1001);
		 }
		 System.out.println("余额:"+balance);
		
	}
}
