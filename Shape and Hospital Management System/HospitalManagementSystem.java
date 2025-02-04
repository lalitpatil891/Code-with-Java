// Question 2: Hospital Management System
class HospitalStaff {
    private String name;
    private int age;
    private String role;

    public HospitalStaff(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }
    public void work() {
        System.out.println(role + " " + name + " is working.");
    }
}

class Doctor extends HospitalStaff {
    private String specialization;
    public Doctor(String name, int age, String specialization) {
        super(name, age, "Doctor");
        this.specialization = specialization;
    }
    @Override
    public void work() {
        System.out.println("Doctor " + name + " with specialization in " + specialization + " is treating patients.");
    }
}

class Nurse extends HospitalStaff {
    private int yearsOfExperience;
    public Nurse(String name, int age, int yearsOfExperience) {
        super(name, age, "Nurse");
        this.yearsOfExperience = yearsOfExperience;
    }
    @Override
    public void work() {
        System.out.println("Nurse " + name + " with " + yearsOfExperience + " years of experience is taking care of patients.");
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Smith", 40, "Cardiology");
        Nurse nurse = new Nurse("Alice", 30, 5);
        doctor.work();
        nurse.work();
    }
}
