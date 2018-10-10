package com.rainnie.myself2;

public class Penguin extends Pet{
	 
	public String sex;
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String print() {
		 return "Name:"+name+"\t Health:"+health+"\t Love:"+love+"\t Sex:"+sex;
	}
	
}
