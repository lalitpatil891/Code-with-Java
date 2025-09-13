package com.nit.student_fee_management_system_inheritance;

public class Tester {

	public static void main(String[] args) {
		
		// Test Case 1: Invalid Input
        Student invalidStudent = new Student(0, "Invalid", -25000.0);
        DayScholar invalidDayScholar = new DayScholar(1, "Invalid", 25000.0, -5000.0);
        Hosteller invalidHosteller = new Hosteller(2, "Invalid", 25000.0, -8000.0);
	
        System.out.println("----------------------------------------");
        
        Student student = new Student(1, "John Smith", 25000.0);
        System.out.println(student.displayDetails());
        double remainingAmount = student.payFee(25000.0);
        if(remainingAmount == 0) {
        	System.out.println("All Fees are clear");
        }
        else
        {
        	System.out.println("Remaining amount to pay is: "+Math.abs(remainingAmount));
        }
        
        System.out.println("----------------------------------------");
        DayScholar dayScholar = new DayScholar(2, "Brian Lara", 25000.0, 5000.0);
        System.out.println(dayScholar.displayDetails());
        remainingAmount = dayScholar.payFee(37000.0);
        if (remainingAmount == 0) {
            System.out.println("All Fees are clear");
        } else {
            System.out.println("Remaining amount to pay is: " + Math.abs(remainingAmount));
        }

        System.out.println("----------------------------------------");
        Hosteller hosteller = new Hosteller(3, "Virat Kohli", 25000.0, 8000.0);
        System.out.println(hosteller.displayDetails());
        remainingAmount = hosteller.payFee(33000.0);
        if (remainingAmount == 0) {
            System.out.println("All Fees are clear");
        } else {
            System.out.println("Remaining amount to pay is: " + Math.abs(remainingAmount));
        }
	
	}

}
