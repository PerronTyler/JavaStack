package com.tyler.zookeeper;

import com.tyler.zookeeper.models.Bat;

public class BatTest {

	public static void main(String[] args) {
		Bat bat1 = new Bat();
		System.out.println(bat1.getEnergy());
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown();
		bat1.eatHuman();
		bat1.eatHuman();
		bat1.fly();
		bat1.fly();
		System.out.println(bat1.getEnergy());
	}

}
