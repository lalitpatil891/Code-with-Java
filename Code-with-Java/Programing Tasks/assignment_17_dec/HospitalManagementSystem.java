/** Assignment (17-DEC) ||  Question-2 */

package com.nit.assignment_17_dec;

public class HospitalManagementSystem {

	public static void main(String[] args) {

		HospitalStaff hs = new HospitalStaff("Lalit", 24, "Engineer");

		Doctor doctor = new Doctor("john", 40, "Doctor", "Cardiology");

		Nurse nurse = new Nurse("Alice", 30, "Nurse", 5);

		hs.work();
		doctor.work();

		nurse.work();

	}
}

/*
 * OUTPUT
 * 
 * EngineerLalit is working. Doctor with specialization in Cardiology is
 * treating patients. Nurse with 5 years of experience is taking of patients.
 * 
 */
