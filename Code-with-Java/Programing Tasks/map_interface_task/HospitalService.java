package com.nit.map_lab_task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//HospitalService Class
class HospitalService {
	private List<Hospital> hospitalList = new ArrayList<>();
    private Map<Integer, String> hospitalMap = new HashMap<>();
    
    // Method to add a hospital
    public int addHospital(String name, List<String> treatments, String contactPerson, String contactNumber, String location) {
        Hospital hospital = new Hospital(name, treatments, contactPerson, contactNumber, location);
        hospitalList.add(hospital);
        hospitalMap.put(hospital.getHospitalCode(), hospital.getHospitalName());
        return hospital.getHospitalCode();
    }
    
    // Method to get hospitals
    public Map<Integer, String> getHospitals() {
        return hospitalMap;
    }
    
    // Method to get hospital details by code
    public Hospital getHospitalDetails(int code) {
        for (Hospital hospital : hospitalList) {
            if (hospital.getHospitalCode() == code) {
                return hospital;
            }
        }
        return null;
    }
}
