package com.nit.exam_21_dec_hotel_reservation_system;

public class Customer {
	private String name;
	private String contactNumber;
	private Reservation reservation;

	public Customer(String name, String contactNumber, Reservation reservation) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.reservation = reservation;
	}

	public void displayCustomerDetails() {

		System.out.println("Customer Name: " + name);
		System.out.println("Contact Number: " + contactNumber);
		reservation.displayReservationDetails();
		System.out.println("Total Cost: " + reservation.calculateCost());
	}

}
