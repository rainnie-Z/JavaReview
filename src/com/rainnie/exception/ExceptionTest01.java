package com.rainnie.exception;
/*
 * 严重问题：Error 我们不处理。这种问题一般都是很严重的，比如说内存溢出。
 * 问题：Exception
 * 			编译期问题:CheckedException,不是RuntimeException的异常 必须进行处理的，因为你不处理，编译就不能通过。
 * 			运行期问题:RuntimeException	这种问题我们也不处理，因为是你的问题，而且这个问题出现肯定是我们的代码不够严谨，需要修正代码的。
 */
/*
 * 异常的处理有throws和try catch finally
 * 注意：try里面的代码要越少越好，catch里面一定要有内容，即使是简单的提示内容也要写。
 */
public class ExceptionTest01 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
		}
		/*System.out.println(a/b);//java.lang.ArithmeticException: / by zero*/
		System.out.println("over");
	}
}
