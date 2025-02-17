Cab Customer Service
--------------------
Description

This project implements a simple cab customer service system in Java. It includes three classes:

CabCustomer: Represents a cab customer with details like ID, name, pickup/drop locations, distance traveled, and phone number.

CabCustomerService: Manages customer records and calculates billing based on ride distance.

CabCustomerServiceTester: Tests the functionalities of the system.

Features

Add Customer: Stores customer details in an ArrayList.

Identify Returning Customers: Checks if a customer has booked before using their phone number.

Calculate Billing:

First-time users ride for free.

Rides up to 4 km cost ₹80.

Rides beyond 4 km cost ₹80 + ₹6 per km.

Print Bill: Displays the final bill for each ride.

Usage

Clone the repository.

Compile and run CabCustomerServiceTester.java.

Observe the output for different test cases.

Example Output

John Please pay your bill of Rs.0.0
Smith Please pay your bill of Rs.180.0
John Please pay your bill of Rs.80.0

Technologies Used

Java

ArrayList for customer storage

How to Run

Install Java (if not already installed).

Compile the program:

javac CabCustomerServiceTester.java

Run the program:

java CabCustomerServiceTester

Contribution

Feel free to fork the repository and submit pull requests with improvements or additional features.
