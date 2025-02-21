<!---# 🚀 Java Projects Repository  --->

## 📌 About This Repository

This repository contains **Java-related tasks, projects, and practice exercises**. It serves as a collection of Java programming concepts, covering fundamental and advanced topics, including real-world applications.

## 📂 Contents

- **Object-Oriented Programming (OOP)** – Inheritance, Encapsulation, method overriding, polymorphism, Random Object Generation – Using `Math.random()`, Factory Method, User Input Handling – Using `Scanner` to take input dynamically, Conditional Logic...  
1)  [Shape Hierarchy – Geometric shape classification](#question-1-shape-hierarchy)
2)  [Hospital Management System – Real-world application of OOP](#question-2-hospital-management-system)
3) [Student Grade Calculator](#student-grade-calculator)
4) [Employee Management System](#employee-management-system)

- **Multithreading & Concurrency** – Covers thread creation, synchronization, executors, etc.

   1) [OLA Cab Booking Process - Multithreading in Java](#-ola-cab-booking-process---multithreading-in-java)

- **Logical Arrays** – Covers boolean arrays, conditional indexing, masking, and logical operations.

  1) [MCQ Or Logical Programs](#)

- **Collections** – Covers List, Set, Map, Queue, Deque, Collections utility class, and iterators.

    1) [Cab Customer Service](#cab-customer-service)



------------------------------------------------------------------------------------------------------
## [Student Grade Calculator](StudentGradeCalculator)

✅ Object-Oriented Programming (OOP) – , Inheritance, and Method Overriding  
✅ Factory Method – Implementing a factory method for grade calculation  
✅ User Input Handling – Using `Scanner` to take input dynamically  
✅ Conditional Logic – Applying grading criteria using `if-else` conditions  

## Problem Statement
Create a Java program to determine a student's grade based on their marks. The program should include the following:
- `Student` class with `name` and `marks` attributes.
- `StudentGrade` class to store student information and grade.
- `CalculateStudentGrade` class with a factory method to determine the grade.
- `StudentGradeCalculator` class with the `main` method to take input and display the result.

## Implementation Details
- `Student` class contains private fields, a parameterized constructor, getter/setter methods, and an overridden `toString()`.
- `StudentGrade` class associates a student with a grade and has an overridden `toString()`.
- `CalculateStudentGrade` has a `calculateGrade(Student student)` method to determine grades based on marks.
- `StudentGradeCalculator` (ELC class) contains the `main` method for user interaction and program execution.

## How to Run
1. Compile all Java files:
   ```sh
   javac Student.java StudentGrade.java CalculateStudentGrade.java StudentGradeCalculator.java
   ```
2. Run the program:
   ```sh
   java StudentGradeCalculator
   ```
3. Enter student details when prompted and view the calculated grade.

## Example Output
```
Enter Student Name: John
Enter Student Marks: 85
The Student John has 'B' Grade
```
---------------------------------------------------------------------------------------------------------------------
## Shape and Hospital Management System
"DateOfAssingment: 27-DEC-2024".

## Question 1: [Shape Hierarchy](Shape and Hospital Management System)

### Problem Statement

Implement a class `Shape` with three subclasses: `Circle`, `Triangle`, and `Square`. Each class should have `draw()` and `erase()` methods that override the base class methods. The `Shape` class should also have a `randshape()` method that randomly generates an instance of one of the subclasses.

### Implementation Details

- `Shape` is the base class with default `draw()` and `erase()` methods.
- `Circle`, `Triangle`, and `Square` override these methods with specific behavior.
- `randshape()` generates a random shape instance.
- The `ShapeDemo` class contains the `main` method to test the implementation.

### How to Run

1. Compile and run `ShapeDemo.java`.
2. Observe the random shape generation and method overriding in action.

---

## Question 2: [Hospital Management System](Shape and Hospital Management System)

### Problem Statement

Design a Hospital Management System using inheritance. Create a base class `HospitalStaff` with `name`, `age`, and `role` attributes, and a `work()` method. Extend this class into `Doctor` and `Nurse` with specific attributes and method overrides.

### Implementation Details

- `HospitalStaff` is the base class with a `work()` method.
- `Doctor` extends `HospitalStaff` and includes a `specialization` attribute.
- `Nurse` extends `HospitalStaff` and includes `yearsOfExperience`.
- The `HospitalManagementSystem` class contains the `main` method to test the implementation.

### How to Run

1. Compile and run `HospitalManagementSystem.java`.
2. Observe role-based behavior using method overriding.
------------------------------------------------------------------------------------------------------
### 🚖 [OLA Cab Booking Process - Multithreading in Java](OLA Cab Booking Process - Multithreading in Java)    
"DateOfAssingment: 30-JAN-2025".

This project simulates an OLA Cab Booking Process using multithreading in Java. It consists of six different classes that extend the Thread class (or use anonymous inner classes). Each thread represents a different stage in the cab booking process.

### 📌 Classes and Their Functionalities

1. **🚗 RideRequest**
   - Prints: "User requested a ride..."
   - Waits for 2 seconds
   - Prints: "Searching for nearby drivers..."

2. **🧑‍✈️ DriverAssignment**
   - Waits for 3 seconds
   - Prints: "Driver found and assigned!"

3. **💰 FareCalculation**
   - Prints: "Calculating estimated fare..."
   - Waits for 1.5 seconds
   - Prints: "Estimated fare: 135.75 RS."

4. **📍 LiveTracking**
   - Prints the ride progress in 20% increments
   - Prints: "Ride Completed!"

5. **💳 PaymentProcessing**
   - Prints: "Processing payment..."
   - Waits for 2 seconds
   - Prints: "Payment successful!"

6. **⭐ RatingSystem**
   - Prints: "Requesting user rating..."
   - Waits for 1 second
   - Prints: "User rated the ride: 5 star"

### 🔄 Execution Order

- RideRequest and FareCalculation start together
- `join()` is called on RideRequest to ensure it completes before proceeding
- Threads execute sequentially following the natural order of ride processing

### 📜 Expected Output

```
User requested a ride...
Calculating estimated fare...
Estimated fare: 135.75 RS.
Searching for nearby drivers...
Driver found and assigned!
Updating ride location... 20% completed
Updating ride location... 40% completed
Updating ride location... 60% completed
Updating ride location... 80% completed
Updating ride location... 100% completed
Ride completed!
Processing payment...
Payment successful!
Requesting user rating...
User rated the ride: 5 star
```

## 🏗 Technologies Used

- Java
- Multithreading (Thread class)
- `join()` and `start()` methods for execution sequence

---------------------------------------------------------------
## [Cab Customer Service](Collections/CabCustomerService)

### Description
This project implements a simple cab customer service system in Java. It includes three classes:
- `CabCustomer`: Represents a cab customer with details like ID, name, pickup/drop locations, distance traveled, and phone number.
- `CabCustomerService`: Manages customer records and calculates billing based on ride distance.
- `CabCustomerServiceTester`: Tests the functionalities of the system.

### Features
- **Add Customer**: Stores customer details in an ArrayList.
- **Identify Returning Customers**: Checks if a customer has booked before using their phone number.
- **Calculate Billing**:
  - First-time users ride for free.
  - Rides up to 4 km cost ₹80.
  - Rides beyond 4 km cost ₹80 + ₹6 per km.
- **Print Bill**: Displays the final bill for each ride.

### Usage
1. Clone the repository.
2. Compile and run `CabCustomerServiceTester.java`.
3. Observe the output for different test cases.

### Example Output
```
John Please pay your bill of Rs.0.0
Smith Please pay your bill of Rs.180.0
John Please pay your bill of Rs.80.0
```

### Technologies Used
- Java
- ArrayList for customer storage

### How to Run
1. Install Java (if not already installed).
2. Compile the program:
   ```sh
   javac CabCustomerServiceTester.java
   ```
3. Run the program:
   ```sh
   java CabCustomerServiceTester
   ```
-------------------------------------------------------------------
# [Employee Management System](https://github.com/lalitpatil891/CodeWithJava/tree/main/enum%20In%20java/Employee%20Management%20System)

## Overview
This Java program demonstrates an Employee Management System with inheritance, method overriding, and enums. It includes the following classes:

- **Employee**: Base class with attributes like name, employee ID, and salary.
- **Manager**: Subclass of Employee with an additional type (HR or Sales) and customized salary logic.
- **Clerk**: Subclass of Employee with attributes for typing speed and accuracy, with conditional salary bonuses.
- **ManagerType**: Enum defining manager types (HR, SALES).
- **EmployeeTester**: Main class to test the functionalities.

## Features
- Object-Oriented Programming (OOP) concepts.
- Method overriding for salary adjustments.
- Enum usage for Manager types.
- Conditional logic for Clerk salary bonuses.

## Program Structure
```
├── Employee.java
├── Manager.java
├── Clerk.java
├── ManagerType.java
└── EmployeeTester.java
```

## Usage
1. **Compile the Java files:**
   ```bash
   javac *.java
   ```

2. **Run the program:**
   ```bash
   java EmployeeTester
   ```

3. **Expected Output:**
   ```
   HR Manager Salary: 60000.0
   Sales Manager Salary: 55000.0
   Clerk Salary (initial): 30000.0
   Clerk Salary (after qualifying): 31000.0
   Clerk Salary (after further improvement): 31000.0
   ```

## How It Works
- **Manager**: Overrides `setSalary()` to add:
  - 10,000 for HR managers.
  - 5,000 for Sales managers.

- **Clerk**:
  - Earns a 1,000 bonus if typing speed > 70 and accuracy > 80.
  - Bonus is applied only once even if speed/accuracy improves further.

-------------------------------------------------------------------
## 💡 How to Use


1. Clone the repository:
   ```sh
   git clone https://github.com/lalitpatil891/CodeWithJava.git
   ```
2. Open the project in any Java IDE (Eclipse, IntelliJ, or VS Code).
3. Run individual programs as needed.

## 🤝 Contributions & Feedback

Feel free to fork this repository, raise issues, or suggest improvements.

## 📜 License

This project is open-source and can be modified as needed.
