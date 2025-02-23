import java.util.ArrayList;

public class MovieTicketBooking {
    private ArrayList<String> bookedSeats;

    public MovieTicketBooking() {
        bookedSeats = new ArrayList<>();
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber) {
        if (!bookedSeats.contains(seatNumber)) {
            bookedSeats.add(seatNumber);
            System.out.println("Ticket booked: " + seatNumber);
        } else {
            System.out.println("Seat " + seatNumber + " is already booked.");
        }
    }

    // Method to cancel a ticket
    public void cancelTicket(String seatNumber) {
        if (bookedSeats.remove(seatNumber)) {
            System.out.println("Ticket canceled: " + seatNumber);
        } else {
            System.out.println("Seat " + seatNumber + " was not booked.");
        }
    }

    // Method to display all booked seats
    public void displayBookedSeats() {
        System.out.println("Booked Seats: " + bookedSeats);
    }

    // Method to get the total number of bookings
    public int getTotalBookings() {
        return bookedSeats.size();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        MovieTicketBooking booking = new MovieTicketBooking();

        booking.bookTicket("A1");
        booking.bookTicket("B2");
        booking.bookTicket("C3");
        booking.displayBookedSeats();
        System.out.println("Total Bookings: " + booking.getTotalBookings());

        booking.cancelTicket("B2");
        booking.displayBookedSeats();
        System.out.println("Total Bookings after cancellation: " + booking.getTotalBookings());
    }
}
