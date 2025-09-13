package com.nit.exam_22_feb_2025;

import java.util.ArrayList;

public class MovieTicketBooking {

	private ArrayList<String> bookedSeats;

	public MovieTicketBooking() {
		bookedSeats = new ArrayList<>();
	}

	// Method to book a ticket
	public void bookTicket(String seatNumber) {
		
		if(!bookedSeats.contains(seatNumber)) {
			
			bookedSeats.add(seatNumber);
			System.out.println("Ticket booked: "+seatNumber);
		}
		else
		{
			System.out.println("Seat" + seatNumber +" is already booked.");
			
		}
	}
	
	
	public Integer getTotalBookings() {
			
		return bookedSeats.size();
	}
	
	
	public void displayBookedSeats() {
		System.out.println("Booked Seats:"+bookedSeats);
	}
	
	
	public void cancelTicket(String seatNumber) {
		
		if(bookedSeats.contains(seatNumber)){
			
			bookedSeats.remove(seatNumber);
			System.out.println("Ticket canceled: "+seatNumber);
		}
		else
		{
			System.out.println("Seat "+seatNumber+" not found.!");
		}
	}
	

	public static void main(String[] args) {
		
		MovieTicketBooking booking = new MovieTicketBooking();
		booking.bookTicket("A1");
		booking.bookTicket("B2");
		booking.bookTicket("C3");
		
		booking.displayBookedSeats();
	    
		System.out.println("Total Bookings: " + booking.getTotalBookings());
		booking.cancelTicket("A1");
		booking.cancelTicket("B2");
		booking.cancelTicket("C3");
		
		booking.displayBookedSeats();
		System.out.println("Total Bookings after Cancelation: " + booking.getTotalBookings());
		
	}

}

/**
MovieTicketELC

 A multiplex cinema wants to maintain a system for managing movie ticket 
   bookings. The system should:
   - Allow users to book tickets for a movie.
   - Allow users to cancel a booking.
   - Show all booked seats in order of booking.
   - Get the total number of booked seats.

Collection to Use: ArrayList<String>

Class: MovieTicketBooking

Variables:
ArrayList<String> bookedSeats --> Stores the list of booked seats in the order of booking.
Methods:
     - bookTicket(String seatNumber): Books a ticket.
     - cancelTicket(String seatNumber): Cancels a ticket if it exists.
     - displayBookedSeats(): Displays all booked seats.
     - getTotalBookings(): Returns the total number of booked tickets.

Test Cases
MovieTicketBooking booking = new MovieTicketBooking();
booking.bookTicket("A1");
booking.bookTicket("B2");
booking.bookTicket("C3");
booking.displayBookedSeats();
System.out.println("Total Bookings: " + booking.getTotalBookings());
booking.cancelTicket("B2");
booking.displayBookedSeats();

Expected Output:
Booked Seats: [A1, B2, C3]
Total Bookings: 3
Booked Seats after cancellation: [A1, C3]


Sample Input
booking.bookTicket("A1");
booking.bookTicket("B2");
booking.bookTicket("C3");
booking.displayBookedSeats();
System.out.println("Total Bookings: " + booking.getTotalBookings());

Sample Output
Ticket booked: A1
Ticket booked: B2
Ticket booked: C3
Booked Seats: [A1, B2, C3]
Total Bookings: 3

*/
