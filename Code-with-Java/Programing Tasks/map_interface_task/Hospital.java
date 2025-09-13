package com.nit.map_lab_task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Hospital {
	private static int idCounter = 100;
	private int hospitalCode;
	private String hospitalName;
	private List<String> listOfTreatments;
	private String contactPerson;
	private String contactNumber;
	private String location;

	// Constructor
	public Hospital(String hospitalName, List<String> listOfTreatments, String contactPerson, String contactNumber,
			String location) {
		this.hospitalCode = idCounter++;
		this.hospitalName = hospitalName;
		this.listOfTreatments = listOfTreatments;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.location = location;
	}

	// Getters
	public int getHospitalCode() {
		return hospitalCode;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public List<String> getListOfTreatments() {
		return listOfTreatments;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getLocation() {
		return location;
	}

	// toString() method
	@Override
	public String toString() {
		return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + ", listOfTreatments="
				+ listOfTreatments + ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber
				+ ", location=" + location + "]";
	}
}



