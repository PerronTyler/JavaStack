package com.caresoft.clinicapp.methods;
import java.util.ArrayList;
import java.util.Date;

import com.caresoft.clinicapp.interfaces.HIPAACompliantUser;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	
	public Physician() {
		super();
	}
	public Physician(int id) {
		super(id);
	}
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
    
public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
@Override
public boolean assignPin(int pin) {
	if(pin >= 1000 && pin < 10000) {
		return true;
	} else {
		return false;	
	}
}
@Override
public boolean accessAuthorized(Integer confirmedAuthID) {
	if(super.getId() == confirmedAuthID) {
		return true;
	} else {
		return false;	
	}
}

@Override
public ArrayList<String> reportSecurityIncidents() {
	// TODO Auto-generated method stub
	return null;
}
	
    // TO DO: Setters & Getters

}
