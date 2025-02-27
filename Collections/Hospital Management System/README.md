## Hospital Management System

### Overview
This Java-based Hospital Management System utilizes the **Map** interface to manage hospital details, treatments, and contact information efficiently. It provides functionalities to add hospitals, retrieve hospital details, and manage a list of treatments offered.

### Features
### 1. **Hospital Class**
- Stores hospital details including:
  - `hospitalCode` (Auto-generated starting from 100)
  - `hospitalName`
  - `listOfTreatments` (List of treatments available)
  - `contactPerson`
  - `contactNumber`
  - `location`
- Implements Getters, Setters, and `toString()` for formatted output.

### 2. **HospitalService Class**
- `addHospital(String hospitalName, List<String> treatments, String contactPerson, String contactNumber, String location)`:
  - Adds hospital details to an `ArrayList` of type `Hospital`.
  - Generates a unique hospital code.
  - Returns the generated hospital code.

- `getHospitals()`:
  - Returns existing hospitals in a `Map<Integer, String>` format where hospital code is the key and hospital name is the value.

- `getHospitalDetails(int hospitalCode)`:
  - Searches the `ArrayList` for the hospital matching the given code.
  - Returns the `Hospital` object or `null` if not found.

### 3. **HospitalFinder Class**
- Contains the `main` method.
- Creates multiple `Hospital` objects.
- Tests functionalities of `HospitalService` by adding and retrieving hospitals.

### Example Usage
```java
HospitalService service = new HospitalService();
int code1 = service.addHospital("YASHODA", Arrays.asList("Cardiac", "ENT", "Ortho"), "MATHEWS", "9848222222", "Sec");
int code2 = service.addHospital("APOLLO", Arrays.asList("Neuro", "Ortho", "General Medicine"), "JOHN", "9876543210", "Hyd");

System.out.println(service.getHospitals());
System.out.println(service.getHospitalDetails(code1));
```

### Sample Output
```
{100=YASHODA, 101=APOLLO}
Hospital [hospitalCode=100, hospitalName=YASHODA, listOfTreatments=[Cardiac, ENT, Ortho], contactPerson=MATHEWS, contactNumber=9848222222, location=Sec]
```

### Technologies Used
- **Java**
- **Collections Framework (ArrayList, HashMap)**
