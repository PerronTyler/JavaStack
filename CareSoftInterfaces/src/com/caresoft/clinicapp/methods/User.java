package com.caresoft.clinicapp.methods;

public class User {
	
	    protected Integer id;
		protected int pin;
	    
	    // TO DO: Getters and setters
		// Implement a constructor that takes an ID

	public User() {
		this.id = 0;
	}	
	public User(Integer id) {
		this.id = id;
	}
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		return false;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}
