package com.rainnie.homework2;

public class KeCar {
	private double speed;
	private Integer weight;
	public double getSpeed() {
		if(weight>4) {
			return (int) (speed-(weight-4)*3.5);
		}else {
			return speed;
		}
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	
}
