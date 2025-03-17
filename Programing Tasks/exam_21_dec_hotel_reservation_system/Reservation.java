package com.nit.exam_21_dec_hotel_reservation_system;

public class Reservation {

	protected String reservationType;
	protected int nights;

	public Reservation(String reservationType, int nights) {
		this.reservationType = reservationType;
		this.nights = nights;
	}

	public double calculateCost() {
		return 0.0;
	}

	public void displayReservationDetails() {
		System.out.println("Reservation Type: " + reservationType);
		System.out.println("Number Of Nights: " + nights);
	}
}

class StandardReservation extends Reservation {

	public StandardReservation(String reservationType, int nights) {
		super(reservationType, nights);
	}

	@Override
	public double calculateCost() {
		return nights * 2000.0;
	}
}

class DeluxeReservation extends Reservation {

	 // Parameterized constructor
    public DeluxeReservation(String reservationType, int nights) {
        super(reservationType, nights);
    }

	@Override
	public double calculateCost() {
		return nights * 4000.0;
	}

}