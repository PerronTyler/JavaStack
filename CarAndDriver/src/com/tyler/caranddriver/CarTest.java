package com.tyler.caranddriver;


import com.tyler.caranddriver.models.Driver;

public class CarTest {

	public static void main(String[] args) {
		
		Driver driver1 = new Driver();
		
		System.out.println(driver1.getGas());
		driver1.drive();
		System.out.println(driver1.getGas());
		driver1.useBoosters();
		System.out.println(driver1.getGas());
		driver1.refuel();
		System.out.println(driver1.getGas());
	}

}
