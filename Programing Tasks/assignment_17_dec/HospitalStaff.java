/** Assignment (17-DEC) ||  Question-2 */

package com.nit.assignment_17_dec;

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
		System.out.println(role + "" + name + " is working.");
	}
}

class Doctor extends HospitalStaff {

	private String specialization;

	public Doctor(String name, int age, String role, String specialization) {
		super(name, age, role);
		this.specialization = specialization;
	}

	public void work() {
		System.out.println(getRole() + " with specialization in " + specialization + " is treating patients.");
	}

	private String getRole() {
		return "Doctor";
	}

	/*
	 * private String getName() { return super.getClass().getSuperclass().getName();
	 * }
	 */
}

class Nurse extends HospitalStaff {

	private int yearsOfExperience;

	public Nurse(String name, int age, String role, int yearsOfExperience) {
		super(name, age, role);
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public void work() {

		System.out.println(getRole() + " with " + yearsOfExperience + " years of experience is taking of patients.");
	}

	public String getRole() {
		return "Nurse";
	}

	/*
	 * public String getName() { return super.getClass().getSuperclass().getName();
	 * }
	 */
}


/*OUTPUT

EngineerLalit is working.
Doctor with specialization in Cardiology is treating patients.
Nurse with 5 years of experience is taking of patients.

*/