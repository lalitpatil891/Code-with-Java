//Q1: Assignment-6 
package com.nit.simple_vehicle_inheritance_in_java;

public class Vehicle {
	protected String make;
	protected String model;
	protected int year;

	public Vehicle(String make, String model, int year) {
		if (year <= 0) {
			System.out.println("Error Invalid Input");
		}
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public void displayDetails() {

		if (year <= 0) return; // Avoid displaying invalid details
		System.out.println("make: " + make);
		System.out.println("model: " + model);
		System.out.println("year: " + year);
	}
}

class Car extends Vehicle {
	protected int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		if(numberOfDoors <= 0) {
			System.out.println("Error Invalid Input");
			return;
		}
		this.numberOfDoors = numberOfDoors;
	}
	
	@Override
	public void displayDetails() {
		
		if(year <= 0 || numberOfDoors <= 0) return; 
		
		super.displayDetails();
		System.out.println("numberOfDoors: "+numberOfDoors);
	}
}

class Bike extends Vehicle {
	
	protected String type;
	
	public Bike(String make, String model, int year, String type) {
		super(make, model, year);
		if( type == null || type.isEmpty()) {
			System.out.println("Error Invalid Input");
			return;
		}
		this.type = type;
	}
	
	//Override displayDetails
	@Override
	public void displayDetails() {
		
		if(year <= 0 || type == null || type.isEmpty()) return; 
		
		super.displayDetails();
		System.out.println("Type: "+type);
	}
}




