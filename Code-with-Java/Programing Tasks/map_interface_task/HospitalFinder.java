package com.nit.map_lab_task;

import java.util.Arrays;
import java.util.List;

public class HospitalFinder {

	public static void main(String[] args) {

HospitalService service = new HospitalService();
        
        // Adding hospitals
        List<String> treatments1 = Arrays.asList("Cardiac", "ENT", "Ortho", "Pediatric", "Gastro");
        int code1 = service.addHospital("YASHODA", treatments1, "MATHEWS", "9848222222", "Sec");
        
        List<String> treatments2 = Arrays.asList("Neuro", "Dermatology", "Oncology");
        int code2 = service.addHospital("APOLLO", treatments2, "SINGH", "9848333333", "Hyderabad");
        
        // Display hospital list
        System.out.println("Hospital List: " + service.getHospitals());
        
        // Get hospital details
        System.out.println("\nDetails of Hospital with Code " + code1 + " :\n" + service.getHospitalDetails(code1));
        System.out.println("\nDetails of Hospital with Code " + code2 + " :\n" + service.getHospitalDetails(code2));
	}

}


/*OUTPUT

Hospital List: {100=YASHODA, 101=APOLLO}

Details of Hospital with Code 100 :
Hospital [hospitalCode=100, hospitalName=YASHODA, listOfTreatments=[Cardiac, ENT, Ortho, Pediatric, Gastro], contactPerson=MATHEWS, contactNumber=9848222222, location=Sec]

Details of Hospital with Code 101 :
Hospital [hospitalCode=101, hospitalName=APOLLO, listOfTreatments=[Neuro, Dermatology, Oncology], contactPerson=SINGH, contactNumber=9848333333, location=Hyderabad]
*/