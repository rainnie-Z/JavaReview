package com.rainnie.exception;

public class MyExceptionTest {
	public static void main(String[] args) {
		new MyExceptionTest().manager();
	}

	public void manager() {
		 try {
			 regist(-20);
		 }catch(MyException  e){
			 System.out.println("登记失败，出错类型"+e.getIdnumber()+":"+e.getMessage());
		 }
		 System.out.println("本次登记操作结束");
		
	}

	public void regist(int num) throws MyException{
		  if(num<0) {
			  throw new MyException("人数是负值，不合理", 3);
		  }
		  System.out.println("登记人数:"+num);
		
	}
}
