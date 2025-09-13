/** Set:A_Q1_Scenario: Courier Management System. */

package com.nit.exam_21_dec_courier_management_system;

public class Courier {

	public String courierType;
	public double weight;

	public Courier(String courierType, double weight) {
		super();
		this.courierType = courierType;
		this.weight = weight;
	}

	public double calculateCost() {
		return 0.0;
	}

	public void displayCourierDetails() {
		System.out.println("Courier Type: " + courierType);
		System.out.println("Weight: " + weight+ " kg.");
	}
}

class DomesticCourier extends Courier {

	public DomesticCourier(double weight) {
		super("Domestic",weight);
	
	}
	
	@Override
	public double calculateCost() {
		return weight * 50;
	}
}

class InternationalCourier extends Courier {
	
	public InternationalCourier(double weight) {
		super("International", weight);
	}
	
	@Override
	public double calculateCost() {
		return weight* 150;
	}
}
