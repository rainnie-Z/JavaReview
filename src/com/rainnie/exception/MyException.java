package com.rainnie.exception;

public class MyException extends Exception{
	private int idnumber;

	public MyException(String message,int idnumber) {
		super(message);
		this.idnumber = idnumber;
	}

	public int getIdnumber() {
		return idnumber;
	}

	
}
