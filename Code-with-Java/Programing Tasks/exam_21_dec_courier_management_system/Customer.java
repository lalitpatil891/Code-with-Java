/**Set:A_Q1_Scenario: Courier Management System. */
package com.nit.exam_21_dec_courier_management_system;

class Customer {

	private String name;
	private String contactNumber;
	private Courier courier;

	public Customer(String name, String contactNumber, Courier courier) {
		this.name = name;
		this.contactNumber = contactNumber;
		this.courier = courier;
	}

	public void displayCustomerDetails() {
		System.out.println("Customer Name: " + name);
		System.out.println("Contact Number: " + contactNumber);
		courier.displayCourierDetails();

		if (courier instanceof DomesticCourier) {
			System.out.println("Service: within the country");
		} 
		else if (courier instanceof InternationalCourier)
		{

			System.out.println("Service: Across countries");
		}

		System.out.println("Total cost: " + courier.calculateCost() + "Rs.\n");
	}
}