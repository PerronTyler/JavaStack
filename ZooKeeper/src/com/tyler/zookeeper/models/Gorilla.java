package com.tyler.zookeeper.models;

public class Gorilla extends Mammal {

	public Gorilla() {
		super();
	}
	public Gorilla(int energy) {
		super(energy);
	}
	public void eatBananas() {
		super.setEnergy(super.getEnergy() + 10);
		System.out.println("yum banana");
	}
	public void yeet() {
		super.setEnergy(super.getEnergy() - 5);
		System.out.println("yayeeet");
	}
	public void climb() {
		super.setEnergy(super.getEnergy() - 10);
		System.out.println("I climb thing");
	}
}
