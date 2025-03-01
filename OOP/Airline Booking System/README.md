## Airline Booking System

## Overview
The **Airline Booking System** is a Java-based application that allows customers to book tickets for both **domestic** and **international** airlines. The fare is dynamically calculated based on specific business rules such as discounts and taxes.

## Features
- **Inheritance**: The `DomesticAirline` and `InternationalAirline` classes extend the `Airline` base class.
- **Method Overriding**: The `calculateFare()` and `displayDetails()` methods are overridden in the subclasses.
- **Method Overloading**: The `bookTicket()` method handles different types of airline bookings.
- **Dynamic Fare Calculation**: Discounts for domestic airlines and taxes for international airlines are applied automatically.

## Class Structure

### 1. Airline (Base Class)
- Attributes:
  - `String airlineName`: Name of the airline.
  - `double baseFare`: Base fare per seat.
- Methods:
  - `double calculateFare(int seats)`: Calculates the total fare.
  - `void displayDetails()`: Displays airline details.

### 2. DomesticAirline (Subclass of Airline)
- Additional Attributes:
  - `int domesticRoutes`: Number of domestic routes.
  - `double discountRate`: Discount percentage.
- Overridden Methods:
  - `calculateFare(int seats)`: Applies discount to the base fare.
  - `displayDetails()`: Displays domestic airline details.

### 3. InternationalAirline (Subclass of Airline)
- Additional Attributes:
  - `int internationalDestinations`: Number of international destinations.
  - `double taxRate`: Tax percentage.
- Overridden Methods:
  - `calculateFare(int seats)`: Applies tax to the base fare.
  - `displayDetails()`: Displays international airline details.

### 4. BookingSystem (Helper Class)
- Overloaded Methods:
  - `bookTicket(DomesticAirline airline, int seats)`: Handles domestic airline bookings.
  - `bookTicket(InternationalAirline airline, int seats)`: Handles international airline bookings.

### 5. ELC (Main Class)
- Simulates ticket bookings and demonstrates system functionality.

## Sample Input & Output
### Input
**Domestic Airline Booking:**
```
Airline Name: FlyHigh Airways
Base Fare: ₹2000
Domestic Routes: 15
Discount Rate: 10%
Number of Seats: 3
```

**International Airline Booking:**
```
Airline Name: GlobalJet
Base Fare: ₹5000
International Destinations: 25
Tax Rate: 20%
Number of Seats: 2
```

### Output
**Booking Domestic Airline Ticket:**
```
Airline Name: FlyHigh Airways
Base Fare: ₹2000.0
Domestic Routes: 15
Discount Rate: 10.0%
Total Fare (after discount): ₹5400.0
```

**Booking International Airline Ticket:**
```
Airline Name: GlobalJet
Base Fare: ₹5000.0
International Destinations: 25
Tax Rate: 20.0%
Total Fare (including tax): ₹12000.0
```

### Contributions
Feel free to contribute by adding new features, optimizing calculations, or improving the structure!
