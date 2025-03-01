// Base class: Airline
class Airline {
    protected String airlineName;
    protected double baseFare;

    public Airline(String airlineName, double baseFare) {
        this.airlineName = airlineName;
        this.baseFare = baseFare;
    }

    public double calculateFare(int seats) {
        return baseFare * seats;
    }

    public void displayDetails() {
        System.out.println("Airline Name: " + airlineName);
        System.out.println("Base Fare: ₹" + baseFare);
    }
}

// Subclass: DomesticAirline
class DomesticAirline extends Airline {
    private int domesticRoutes;
    private double discountRate;

    public DomesticAirline(String airlineName, double baseFare, int domesticRoutes, double discountRate) {
        super(airlineName, baseFare);
        this.domesticRoutes = domesticRoutes;
        this.discountRate = discountRate;
    }

    @Override
    public double calculateFare(int seats) {
        double totalFare = super.calculateFare(seats);
        return totalFare - (totalFare * discountRate / 100);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Domestic Routes: " + domesticRoutes);
        System.out.println("Discount Rate: " + discountRate + "%");
    }
}

// Subclass: InternationalAirline
class InternationalAirline extends Airline {
    private int internationalDestinations;
    private double taxRate;

    public InternationalAirline(String airlineName, double baseFare, int internationalDestinations, double taxRate) {
        super(airlineName, baseFare);
        this.internationalDestinations = internationalDestinations;
        this.taxRate = taxRate;
    }

    @Override
    public double calculateFare(int seats) {
        double totalFare = super.calculateFare(seats);
        return totalFare + (totalFare * taxRate / 100);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("International Destinations: " + internationalDestinations);
        System.out.println("Tax Rate: " + taxRate + "%");
    }
}

// Booking System
class BookingSystem {
    public void bookTicket(DomesticAirline airline, int seats) {
        System.out.println("\nBooking Domestic Airline Ticket:");
        System.out.println("--------------------------------------");
        airline.displayDetails();
        System.out.println("Total Fare (after discount): ₹" + airline.calculateFare(seats));
    }

    public void bookTicket(InternationalAirline airline, int seats) {
        System.out.println("\nBooking International Airline Ticket:");
        System.out.println("--------------------------------------");
        airline.displayDetails();
        System.out.println("Total Fare (including tax): ₹" + airline.calculateFare(seats));
    }
}

// Main class
public class AirlineBookingSystem {
    public static void main(String[] args) {
        DomesticAirline domestic = new DomesticAirline("FlyHigh Airways", 2000, 15, 10);
        InternationalAirline international = new InternationalAirline("GlobalJet", 5000, 25, 20);

        BookingSystem bookingSystem = new BookingSystem();
        bookingSystem.bookTicket(domestic, 3);
        bookingSystem.bookTicket(international, 2);
    }
}
