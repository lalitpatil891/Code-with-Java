package com.nit.exam_21_dec_hotel_reservation_system;

public class HotelReservationSystem {

	public static void main(String[] args) {

		   // Create Reservation objects
        Reservation standardReservation = new StandardReservation("Standard", 4);
        Reservation deluxeReservation = new DeluxeReservation("Deluxe", 5);

        // Create Customer objects
        Customer customer1 = new Customer("Alice Johnson", "9876543210", standardReservation);
        Customer customer2 = new Customer("Bob Williams", "8765432109", deluxeReservation);

        // Display customer details
        System.out.println("Customer 1 Details:");
        customer1.displayCustomerDetails();

        System.out.println("----------------------------");
        
        System.out.println("Customer 2 Details:");
        customer2.displayCustomerDetails();

	}

}
