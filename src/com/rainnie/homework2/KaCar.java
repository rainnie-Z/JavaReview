package com.rainnie.homework2;

public class KaCar {
	private Integer speed;
	private Integer weight;
	public Integer getSpeed() {
		if(weight>10) {
			return (int) (speed-(weight-10)*1.5);
		}else {
			return speed;
		}
		 
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
}
