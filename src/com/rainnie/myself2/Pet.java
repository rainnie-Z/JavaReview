package com.rainnie.myself2;

public class Pet {
	public String name;
	public int health;
	public int love;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public String print() {
		 return "Name:"+getName()+"\tHealth:"+getHealth()+"\tLove:"+getLove();
	}
	
}
