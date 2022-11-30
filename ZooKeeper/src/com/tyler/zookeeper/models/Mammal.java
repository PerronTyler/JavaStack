package com.tyler.zookeeper.models;

public class Mammal {
	//attributes
	private int energy;
	
	public Mammal() {
		this.setEnergy(100);
	}
	public Mammal(int energy) {
		this.setEnergy(energy);
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
}
