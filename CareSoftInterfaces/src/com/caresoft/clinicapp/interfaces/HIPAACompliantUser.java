package com.caresoft.clinicapp.interfaces;

import java.util.ArrayList;

public interface HIPAACompliantUser {
	    abstract boolean assignPin(int pin);
	    abstract boolean accessAuthorized(Integer confirmedAuthID);
		ArrayList<String> reportSecurityIncidents();
}
