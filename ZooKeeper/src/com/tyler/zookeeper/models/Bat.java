package com.tyler.zookeeper.models;

public class Bat extends Mammal {

	public Bat() {
		super();
		super.setEnergy(300);
	}
	public Bat(int energy) {
		super(energy);
	}
	public void attackTown() {
		super.setEnergy(super.getEnergy() - 100);
		System.out.println("*burning sounds*");
	}
	public void eatHuman() {
		super.setEnergy(super.getEnergy() + 25);
		System.out.println("yum hooman");
	}
	public void fly() {
		super.setEnergy(super.getEnergy() - 50);  
		System.out.println("Bat used FLY");
	}
}
