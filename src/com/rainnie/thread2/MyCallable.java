package com.rainnie.thread2;

import java.util.concurrent.Callable;
//Callable:是带泛型的接口。
//这里指定的泛型其实是call()方法的返回值类型。
public class MyCallable implements Callable<Integer>{
	private int number;
	
	public MyCallable(int number) {
		this.number=number;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int x = 1; x <= number; x++) {
			sum += x;
		}
		return sum;
	}

}
