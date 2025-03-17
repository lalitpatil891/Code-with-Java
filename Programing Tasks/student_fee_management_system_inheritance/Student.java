package com.nit.student_fee_management_system_inheritance;

public class Student {

	int studentId;
	String name;
	double examFee;
	
	public Student(int studentId, String name, double examFee) {
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}
	
	public String displayDetails() {
		
		return "Student [ StudentId: "+studentId+ ", Name: "+name+", ExamFee: "+examFee+ " ]";
	}
	
	public double payFee(double amount) {
		if(amount <= 0) {
			System.out.println("Error Invalid Input");
			return -1;
		}
		return amount - examFee;
	}
}

class DayScholar extends Student
{
	double transportFee;
	
	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		if(transportFee <= 0) {
			
			System.out.println("Error Invalid Input1");
			return;
		}
		this.transportFee = transportFee;
	}
	
	 // Override displayDetails
    @Override
    public String displayDetails() {
        return "DayScholar[TransportFee=" + transportFee + ",name=" + name + ",studentId=" + studentId + ",examFee=" + examFee + "]";
    }

    // Override payFee
    @Override
    public double payFee(double amount) {
        if (amount <= 0) {
            System.out.println("Error Invalid Input");
            return -1;
        }
        double totalFee = examFee + transportFee;
        return amount - totalFee;
    }
	
}

class Hosteller extends Student
{
	double hostelFee;
	
	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		if(hostelFee <= 0) {
			System.out.println("Error Invalid Input1");
			return;
		}
		this.hostelFee = hostelFee;
	}	
	
	@Override
	public String displayDetails() {	
		return "Hosteller [ Student Id: "+studentId+ ", Name: "+name+ ", examFee: "+examFee+ ", Hostel Fee: "+hostelFee+" ]";
	}
	
	@Override
	public double payFee(double amount) {
		if(amount <=0) {
			System.out.println("Error Invalid Input1");
			return -1;
		}
		
		double totalFee = examFee + hostelFee;
		return amount - totalFee;
	}
}
























