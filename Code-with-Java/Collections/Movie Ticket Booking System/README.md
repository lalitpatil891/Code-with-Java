# Movie Ticket Booking System 🎬🍿

## Overview

`MovieTicketBooking` is a simple Java program that allows users to book and cancel movie tickets in a multiplex cinema. It manages booked seats, displays them in the order of booking, and provides the total number of booked seats.

## Features

- 🎟️ Book tickets for a movie.
- ❌ Cancel a booked ticket.
- 📋 Display all booked seats in the order they were booked.
- 🔢 Get the total number of booked seats.

## Program Structure

```
├── MovieTicketBooking.java
```

## How to Run

1. **Navigate to the project directory.**

2. **Compile the Java program:**

   ```bash
   javac MovieTicketBooking.java
   ```

3. **Run the program:**

   ```bash
   java MovieTicketBooking
   ```

## Sample Input/Output

**Example Run:**

```
Ticket booked: A1
Ticket booked: B2
Ticket booked: C3
Booked Seats: [A1, B2, C3]
Total Bookings: 3
Ticket canceled: B2
Booked Seats: [A1, C3]
Total Bookings after cancellation: 2
```

## Code Explanation

- **ArrayList<String> bookedSeats** stores the booked seats.
- `bookTicket(String seatNumber)` adds a seat if it's not already booked.
- `cancelTicket(String seatNumber)` removes a seat if it exists.
- `displayBookedSeats()` shows all currently booked seats.
- `getTotalBookings()` returns the total number of bookings.

## Contributing

Feel free to fork this repository, submit pull requests, or suggest improvements. 🚀
