package com.tyler.zookeeper;

import com.tyler.zookeeper.models.Gorilla;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla g1 = new Gorilla();
		
		g1.yeet();
		g1.yeet();
		g1.yeet();
		g1.eatBananas();
		g1.eatBananas();
		g1.climb();
		System.out.println(g1.getEnergy());
	}

}
