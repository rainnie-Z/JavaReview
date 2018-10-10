package com.rainnie.myself2;

public class Dog extends Pet{
    public String strain;
	
	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public String print() {
		return "Name:"+name+"\tHealth:"+health+"\tLove:"+love+"\tStrain:"+strain;
	}
}
