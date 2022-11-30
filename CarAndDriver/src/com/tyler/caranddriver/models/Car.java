package com.tyler.caranddriver.models;

public class Car {
		//attributes
		private int tankLimit;
		private int gas;
	public Car() {
		
		this.setTankLimit(10);
		this.setGas(10);
	}
public Car(int gasTankLimit, int gas) {
		
		this.setTankLimit(gasTankLimit);
		this.setGas(gas);
	}
	public int getTankLimit() {
		return tankLimit;
	}
	public void setTankLimit(int tankLimit) {
		this.tankLimit = tankLimit;
	}
	public int getGas() {
		return gas;
	}
	public void setGas(int gas) {
		this.gas = gas;
	}
	public void addGas(int gas) {
		this.gas += gas;
	}
	public void removeGas(int gas) {
		this.gas -= gas;
	}
	// methods
	
}
