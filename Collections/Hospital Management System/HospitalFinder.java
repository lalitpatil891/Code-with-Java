import java.util.*;

// Hospital Class
class Hospital {
    private static int idCounter = 100;
    private int hospitalCode;
    private String hospitalName;
    private List<String> listOfTreatments;
    private String contactPerson;
    private String contactNumber;
    private String location;

    // Constructor
    public Hospital(String hospitalName, List<String> listOfTreatments, String contactPerson, String contactNumber, String location) {
        this.hospitalCode = idCounter++;
        this.hospitalName = hospitalName;
        this.listOfTreatments = listOfTreatments;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
        this.location = location;
    }

    // Getters
    public int getHospitalCode() { return hospitalCode; }
    public String getHospitalName() { return hospitalName; }
    public List<String> getListOfTreatments() { return listOfTreatments; }
    public String getContactPerson() { return contactPerson; }
    public String getContactNumber() { return contactNumber; }
    public String getLocation() { return location; }

    // toString() method
    @Override
    public String toString() {
        return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + ", listOfTreatments=" + listOfTreatments +
                ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber + ", location=" + location + "]";
    }
}

// HospitalService Class
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

// HospitalFinder Class (Main Method)
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
