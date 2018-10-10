package com.rainnie.exception;

public class ExceptionTest02 {
	public static void main(String[] args) {
		//method1();

		//method2();

		//method3();

		method4();
	}
	public static void method4() {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };

		// 爷爷在最后
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
			System.out.println("这里出现了一个异常，你不太清楚是谁，该怎么办呢?");
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("你访问了不该的访问的索引");
		} catch (Exception e) {
			System.out.println("出问题了");
		}

		// 爷爷在前面是不可以的
		// try {
		// System.out.println(a / b);
		// System.out.println(arr[3]);
		// System.out.println("这里出现了一个异常，你不太清楚是谁，该怎么办呢?");
		// } catch (Exception e) {
		// System.out.println("出问题了");
		// } catch (ArithmeticException e) {
		// System.out.println("除数不能为0");
		// } catch (ArrayIndexOutOfBoundsException e) {
		// System.out.println("你访问了不该的访问的索引");
		// }

		System.out.println("over");
	}

	// 两个异常的处理
	public static void method3() {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };

		try {
			System.out.println(arr[3]);
			System.out.println(a / b);
			// System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("你访问了不该的访问的索引");
		}

		System.out.println("over");
	}

	// 两个异常
	public static void method2() {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		}

		int[] arr = { 1, 2, 3 };
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("你访问了不该的访问的索引");
		}

		System.out.println("over");
	}

	// 一个异常
	public static void method1() {
		// 第一阶段
		int a = 10;
		// int b = 2;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println("除数不能为0");
		}

		// 第二阶段
		System.out.println("over");
	}
}
