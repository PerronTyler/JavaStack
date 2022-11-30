package com.tyler.caranddriver.models;


public class Driver extends Car {
		// attributes
		private String name;
		private boolean hasLicense;
		
	public Driver() {
		this.name = "Fred";
		this.setHasLicense(true);
	}
	public Driver(String name) {
		this.name = name;
		this.setHasLicense(true);
	}

	public boolean isHasLicense() {
		return hasLicense;
	}

	public void setHasLicense(boolean hasLicense) {
		this.hasLicense = hasLicense;
	}

	public String getName() {
		return name;
	}
	public void drive() {
		if(super.getGas() > 0) {
		super.removeGas(1);
	} else {
		System.out.println("Not enough Gas to Drive");
	}
}
	public void useBoosters() {
		if(super.getGas() >= 3) {
			super.removeGas(3);
		} else {
			System.out.println("Not enough Gas to Boost");
		}
	}
	public void refuel() {
		if(super.getGas() > (super.getTankLimit() - 2)) {
			super.setTankLimit(super.getTankLimit());
		} else {
			super.addGas(2);
		}
	}
}
