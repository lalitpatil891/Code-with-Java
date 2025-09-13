<!---# 🚀 Java Projects Repository  --->

## 📌 About This Repository

This repository contains **Java-related tasks, projects, and practice exercises**. It serves as a collection of Java programming concepts, covering fundamental and advanced topics, including real-world applications.

## 📂 Contents

- **Object-Oriented Programming (OOP)** – Inheritance, Encapsulation, method overriding, polymorphism, Random Object Generation – Using `Math.random()`, Factory Method, User Input Handling – Using `Scanner` to take input dynamically, Conditional Logic...  
1)  [Shape Hierarchy – Geometric shape classification](#question-1-shape-hierarchy)
2)  [Hospital Management System – Real-world application of OOP](#question-2-hospital-management-system)
3) [Student Grade Calculator](#student-grade-calculator)
4) [Employee Management System](#employee-management-system)
5) [Dynamic Polymorphism in Java – Vehicle Interface Example](dynamic-polymorphism-in-java–vehicle-interface-example)
6) [Airline Booking System](#airline-booking-system)

- **Multithreading & Concurrency** – Covers thread creation, synchronization, executors, etc.

   1) [OLA Cab Booking Process - Multithreading in Java](#-ola-cab-booking-process---multithreading-in-java)

- **Logical Arrays** – Covers boolean arrays, conditional indexing, masking, and logical operations.

  1) [MCQ Or Logical Programs](#)

- **Collections** – Covers List, Set, Map, Queue, Deque, Collections utility class, and iterators.

    1) [Cab Customer Service](#cab-customer-service)
    2) [ListReverser](#listreverser)
    3) [Java Program to Merge Lists & Remove Duplicates](#java-program-to-merge-lists--remove-duplicates)
    4) [Comparing HashMap and LinkedHashMap Iteration Order](#comparing-hashMap-and-linkedHashMap-iteration-order)
    5) [FruitInventoryManagement](#fruitinventorymanagement)
    6) [Hospital Management System](#hospital-management-system)

- **CommandLinePrograms**
    1) [TV Selling Price Calculator](#tv-selling-price-calculator)

- **Java 8 features**
    1) [UniqueWords Program](#uniquewords-program)
    2) [Odd Numbers Square Generator](#odd-numbers-square-generator)
    3) [StartWithVowelAndLengthGreaterThanFive](#startwithvowelandlengthgreaterthanfive)
    4) [SortByLengthAndLexicographically](#sortbylengthandlexicographically)
--------------------------------------------------------------------------------------
## [Java Program to Merge Lists & Remove Duplicates](Collections/MergeListsNoDuplicates)

### Overview

`RemoveDuplicateFromListELC` is a Java program that merges two lists provided by the user and removes duplicate elements, displaying the final list with unique values.

### Features

- Accepts two lists of integers from the user.
- Merges both lists.
- Removes duplicate elements.
- Displays the merged list with unique values.

### Program Structure

```
├── RemoveDuplicateFromListELC.java
```

### How to Run

1. **Navigate to the project directory.**

2. **Compile the Java program:**

   ```bash
   javac RemoveDuplicateFromListELC.java
   ```

3. **Run the program:**

   ```bash
   java RemoveDuplicateFromListELC
   ```

### Sample Input/Output

**Example 1:**

```
Enter the size of the first list: 4
Enter elements: 1 2 3 4
Enter the size of the second list: 4
Enter elements: 3 4 5 6
[1, 2, 3, 4, 5, 6]
```

**Example 2:**

```
4 1 2 3 4 4 3 4 5 6
[1, 2, 3, 4, 5, 6]
```

### Code Explanation

- **Scanner** is used to read input from the user.
- Two lists are stored using `ArrayList<Integer>`.
- Elements from both lists are merged into a new list while checking for duplicates.
- The final list is displayed without any repeated elements.

-------------------------------------------------------------------------------------------------
## [Student Grade Calculator](StudentGradeCalculator)

✅ Object-Oriented Programming (OOP) – , Inheritance, and Method Overriding  
✅ Factory Method – Implementing a factory method for grade calculation  
✅ User Input Handling – Using `Scanner` to take input dynamically  
✅ Conditional Logic – Applying grading criteria using `if-else` conditions  

### Problem Statement
Create a Java program to determine a student's grade based on their marks. The program should include the following:
- `Student` class with `name` and `marks` attributes.
- `StudentGrade` class to store student information and grade.
- `CalculateStudentGrade` class with a factory method to determine the grade.
- `StudentGradeCalculator` class with the `main` method to take input and display the result.

### Implementation Details
- `Student` class contains private fields, a parameterized constructor, getter/setter methods, and an overridden `toString()`.
- `StudentGrade` class associates a student with a grade and has an overridden `toString()`.
- `CalculateStudentGrade` has a `calculateGrade(Student student)` method to determine grades based on marks.
- `StudentGradeCalculator` (ELC class) contains the `main` method for user interaction and program execution.

### How to Run
1. Compile all Java files:
   ```sh
   javac Student.java StudentGrade.java CalculateStudentGrade.java StudentGradeCalculator.java
   ```
2. Run the program:
   ```sh
   java StudentGradeCalculator
   ```
3. Enter student details when prompted and view the calculated grade.

### Example Output
```
Enter Student Name: John
Enter Student Marks: 85
The Student John has 'B' Grade
```
---------------------------------------------------------------------------------------------------------------------
## [Shape and Hospital Management System](https://github.com/lalitpatil891/CodeWithJava/tree/main/Shape%20and%20Hospital%20Management%20System)
"DateOfAssingment: 27-DEC-2024".

## Question 1: Shape Hierarchy

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

## Question 2: Hospital Management System

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
### 🚖 [OLA Cab Booking Process - Multithreading in Java](https://github.com/lalitpatil891/CodeWithJava/tree/main/OLA%20Cab%20Booking%20Process%20-%20Multithreading%20in%20Java)    
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
## [Employee Management System](https://github.com/lalitpatil891/CodeWithJava/tree/main/enum%20In%20java/Employee%20Management%20System)

### Overview
This Java program demonstrates an Employee Management System with inheritance, method overriding, and enums. It includes the following classes:

- **Employee**: Base class with attributes like name, employee ID, and salary.
- **Manager**: Subclass of Employee with an additional type (HR or Sales) and customized salary logic.
- **Clerk**: Subclass of Employee with attributes for typing speed and accuracy, with conditional salary bonuses.
- **ManagerType**: Enum defining manager types (HR, SALES).
- **EmployeeTester**: Main class to test the functionalities.

### Features
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

### Usage
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

### How It Works
- **Manager**: Overrides `setSalary()` to add:
  - 10,000 for HR managers.
  - 5,000 for Sales managers.

- **Clerk**:
  - Earns a 1,000 bonus if typing speed > 70 and accuracy > 80.
  - Bonus is applied only once even if speed/accuracy improves further.

--------------------------------------------------------------
## [ListReverser](Collections/ListReverser)

### Overview
`ReverseListELC` is a simple Java program that takes a list of integers from the user, reverses it, and displays the reversed list.

### Features
- User inputs the size of the list.
- Accepts list elements from the user.
- Reverses the list using Java's `Collections.reverse()`.
- Displays the reversed list.

### Program Structure
```
├── ReverseListELC.java
```

### How to Run

1. **Navigate to the project directory.**

2. **Compile the Java program:**
   ```bash
   javac ReverseListELC.java
   ```

3. **Run the program:**
   ```bash
   java ReverseListELC
   ```

### Sample Input/Output

**Example 1:**
```
Enter the size of the list: 5
Enter elements of the list:
4 5 6 7 8
Reversed list: [8, 7, 6, 5, 4]
```

**Example 2:**
```
Enter the size of the list: 5
Enter elements of the list:
5 4 3 2 1
Reversed list: [1, 2, 3, 4, 5]
```

### Code Explanation
- **Scanner** is used to read input from the user.
- The list is stored using an `ArrayList<Integer>`.
- `Collections.reverse(list)` is used to reverse the list in place.

-------------------------------------------------------------------

## [Comparing HashMap and LinkedHashMap Iteration Order](https://github.com/lalitpatil891/CodeWithJava/tree/main/Collections/Comparing%20HashMap%20and%20LinkedHashMap%20Iteration%20Order)

### Overview

`ComparingHashMapAndLinkedHashMap` is a Java program that demonstrates the difference in iteration order between `HashMap` and `LinkedHashMap`.

- **HashMap** does not guarantee any specific iteration order.
- **LinkedHashMap** maintains the insertion order.

### Features

- Takes dynamic input for key-value pairs.
- Stores entries in both `HashMap` and `LinkedHashMap`.
- Displays the iteration order for both maps.

### Program Structure

```
├── ComparingHashMapAndLinkedHashMap.java
```

### How to Run

1. **Navigate to the project directory.**

2. **Compile the Java program:**

   ```bash
   javac ComparingHashMapAndLinkedHashMap.java
   ```

3. **Run the program:**

   ```bash
   java ComparingHashMapAndLinkedHashMap
   ```

### Sample Input/Output

**Example 1:**

```
Enter number of elements: 5
Enter key: 1
Enter value: One
Enter key: 2
Enter value: Two
Enter key: 3
Enter value: Three
Enter key: 4
Enter value: Four
Enter key: 5
Enter value: Five

HashMap iteration order:
3 -> Three
5 -> Five
1 -> One
2 -> Two
4 -> Four

LinkedHashMap iteration order:
1 -> One
2 -> Two
3 -> Three
4 -> Four
5 -> Five
```

**Example 2:**

```
Enter number of elements: 5
Enter key: 10
Enter value: Ten
Enter key: 20
Enter value: Twenty
Enter key: 30
Enter value: Thirty
Enter key: 40
Enter value: Forty
Enter key: 50
Enter value: Fifty

HashMap iteration order:
50 -> Fifty
20 -> Twenty
40 -> Forty
10 -> Ten
30 -> Thirty

LinkedHashMap iteration order:
10 -> Ten
20 -> Twenty
30 -> Thirty
40 -> Forty
50 -> Fifty
```

### Code Explanation

- **Scanner** is used to take user input.
- Two maps are initialized: `HashMap` and `LinkedHashMap`.
- Both maps are populated with the same key-value pairs.
- Iteration over both maps shows the difference in how they store elements.

-------------------------------------------------------------------
## [FruitInventoryManagement](https://github.com/lalitpatil891/CodeWithJava/tree/main/Collections/FruitInventoryManagement)

### Overview
The **FruitInventoryManagement** Java program manages a collection of fruits and their quantities using a `HashMap`. It allows adding fruits, checking inventory details, and querying for specific fruits and quantities.

### Features
- **Add Fruits:** Add fruits and their quantities to the inventory.
- **Display Total Entries:** Shows the total number of fruits in the inventory.
- **Check if Inventory is Empty:** Verifies if the inventory has any entries.
- **Retrieve Fruit Quantity:** Fetches the quantity of a specific fruit.
- **Check Fruit Existence:** Confirms if a particular fruit exists in the inventory.
- **Check Quantity Existence:** Verifies if a specific quantity exists in the inventory.

### How to Run
1. **Compile the program:**
   ```bash
   javac FruitInventoryManagement.java
   ```

2. **Run the program:**
   ```bash
   java FruitInventoryManagement
   ```

### Sample Output
```
Added Apple: 50
Added Banana: 30
Added Orange: 20
Total number of entries: 3
HashMap is not empty.

Quantity for Apple: 50
Quantity for Banana: 30

Orange exists in the records.
Mango does not exist in the records.

Quantity 20 exists in the records.
Quantity 100 does not exist in the records.
```

### Code Structure
- **Class:** `FruitInventoryManagement`
- **Data Structure:** `HashMap<String, Integer>` to store fruit names and quantities.

### Methods
- `addFruit(Map<String, Integer> inventory, String fruit, int quantity)`: Adds a fruit to the inventory.
- `printQuantity(Map<String, Integer> inventory, String fruit)`: Prints the quantity of a specific fruit.
- `checkFruitExists(Map<String, Integer> inventory, String fruit)`: Checks if a fruit exists.
- `checkQuantityExists(Map<String, Integer> inventory, int quantity)`: Checks if a quantity exists.

Enjoy managing your fruits! 🍎🍌🍊

-------------------------------------------------------------------

## [Hospital Management System](https://github.com/lalitpatil891/CodeWithJava/tree/main/Collections/Hospital%20Management%20System)

### Overview
This Java-based Hospital Management System utilizes the **Map** interface to manage hospital details, treatments, and contact information efficiently. It provides functionalities to add hospitals, retrieve hospital details, and manage a list of treatments offered.

### Features
### 1. **Hospital Class**
- Stores hospital details including:
  - `hospitalCode` (Auto-generated starting from 100)
  - `hospitalName`
  - `listOfTreatments` (List of treatments available)
  - `contactPerson`
  - `contactNumber`
  - `location`
- Implements Getters, Setters, and `toString()` for formatted output.

### 2. **HospitalService Class**
- `addHospital(String hospitalName, List<String> treatments, String contactPerson, String contactNumber, String location)`:
  - Adds hospital details to an `ArrayList` of type `Hospital`.
  - Generates a unique hospital code.
  - Returns the generated hospital code.

- `getHospitals()`:
  - Returns existing hospitals in a `Map<Integer, String>` format where hospital code is the key and hospital name is the value.

- `getHospitalDetails(int hospitalCode)`:
  - Searches the `ArrayList` for the hospital matching the given code.
  - Returns the `Hospital` object or `null` if not found.

### 3. **HospitalFinder Class**
- Contains the `main` method.
- Creates multiple `Hospital` objects.
- Tests functionalities of `HospitalService` by adding and retrieving hospitals.

### Example Usage
```java
HospitalService service = new HospitalService();
int code1 = service.addHospital("YASHODA", Arrays.asList("Cardiac", "ENT", "Ortho"), "MATHEWS", "9848222222", "Sec");
int code2 = service.addHospital("APOLLO", Arrays.asList("Neuro", "Ortho", "General Medicine"), "JOHN", "9876543210", "Hyd");

System.out.println(service.getHospitals());
System.out.println(service.getHospitalDetails(code1));
```

### Sample Output
```
{100=YASHODA, 101=APOLLO}
Hospital [hospitalCode=100, hospitalName=YASHODA, listOfTreatments=[Cardiac, ENT, Ortho], contactPerson=MATHEWS, contactNumber=9848222222, location=Sec]
```

### Technologies Used
- **Java**
- **Collections Framework (ArrayList, HashMap)**


------------------------------------------------------------------
## 🚀 [**Dynamic Polymorphism in Java – Vehicle Interface Example**]()  

### 📌 **Overview**  
This Java program demonstrates **dynamic polymorphism** using an interface `Vehicle` and its implementing classes (`Car`, `Bike`, `Truck`). The `VehicleTest` class dynamically assigns different `Vehicle` objects to a common reference and invokes the overridden `start()` method at runtime.  

### 🏗 **Concepts Used**  
✅ Interface in Java (`Vehicle`)  
✅ Method Overriding  
✅ Dynamic Polymorphism (Runtime Polymorphism)  
✅ Abstraction  

### 📂 **Project Structure**  
```
📦 VehiclePolymorphism
 ┣ 📜 Vehicle.java       # Interface defining vehicle behavior
 ┣ 📜 Car.java           # Car class implementing Vehicle
 ┣ 📜 Bike.java          # Bike class implementing Vehicle
 ┣ 📜 Truck.java         # Truck class implementing Vehicle
 ┗ 📜 VehicleTest.java   # Main class demonstrating polymorphism
```

### 🎯 **How to Run the Program**  
1. Clone the repository or download the files.  
2. Compile all Java files using:  
   ```
   javac *.java
   ```
3. Run the program:  
   ```
   java VehicleTest
   ```
4. Expected Output:  
   ```
   Car is starting with a key ignition.
   Bike is starting with a self-start button.
   Truck is starting with a heavy-duty engine switch.
   ```

### 🚀 **Why Use Dynamic Polymorphism?**  
- Improves **code reusability** and **scalability**  
- Reduces **code duplication**  
- Enables **flexibility** in handling multiple object types through a single reference  


-----------------------------------------------------------
## [Airline Booking System](https://github.com/lalitpatil891/CodeWithJava/tree/main/OOP/Airline%20Booking%20System)

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

-------------------------------------------------------------------
## [TV Selling Price Calculator]
CommandLinePrograms

### Description
This Java program calculates the total selling price of a TV set after including profit, VAT, and service charges. The cost price is passed as a command-line argument, and the program computes the final price based on given percentages.

### Features
- Calculates profit based on a 27% margin.
- Applies VAT of 12.7%.
- Adds a service charge of 3.87%.
- Outputs a detailed breakdown of calculations.

### Usage
### Compilation
```
javac -d . TVSellingPriceCalculator.java
```

### Execution
```
java TVSellingPriceCalculator 32500
```

### Sample Output
```
Cost Price: Rs. 32500.00
Profit (27%): Rs. 8775.00
Selling Price before VAT and Service Charge: Rs. 41275.00
VAT (12.7%): Rs. 5241.93
Service Charge (3.87%): Rs. 1597.34
Total Selling Price: Rs. 48114.27
```

-------------------------------------------------------------------
## [UniqueWords Program](https://github.com/lalitpatil891/Code-with-Java/tree/main/Java%201.8/UniqueWords%20Program)

### Description
This Java program reads multiple sentences from the user and extracts a list of all unique words in lowercase while preserving the order in which they appear.

### Features
- Reads a number of sentences from the user.
- Converts all words to lowercase.
- Removes duplicate words while maintaining the original order.
- Uses Java Streams for efficient processing.

## Usage
### Input Format
1. An integer `n` representing the number of sentences.
2. `n` sentences, each containing multiple words.

### Output Format
- A list of unique words extracted from the sentences, printed in order of appearance.

### Sample Input
```
3
java is beautiful
java is a platform
java is a multithreaded
```

### Sample Output
```
[beautiful, platform, multithreaded]
```

### Implementation
### Code
```java
import java.util.*;
import java.util.stream.Collectors;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> words = new ArrayList<>();
        while (n-- > 0) {
            words.addAll(Arrays.asList(scanner.nextLine().toLowerCase().split(" ")));
        }
        scanner.close();

        // Remove duplicates while maintaining order
        List<String> uniqueWords = words.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqueWords);
    }
}
```

### How It Works
1. The program takes input for `n`, the number of sentences.
2. It then reads `n` sentences and splits them into words while converting them to lowercase.
3. The words are added to a list, preserving their original order.
4. Using Java Streams and `distinct()`, duplicate words are removed.
5. The final list of unique words is printed as output.

### Dependencies
- Java SE 8 or higher
- A Java compiler (e.g., `javac`)

----------------------------------------------------------------------
## [Odd Numbers Square Generator]()

### Description
This Java program generates an infinite stream of odd numbers using `Stream.iterate()` and computes the square of each odd number up to a given limit `N`. The squared values are collected into a list and printed as output.

### How It Works
1. Reads an integer `N` from user input.
2. Generates an infinite stream of odd numbers starting from `1`.
3. Limits the stream to only odd numbers up to `N`.
4. Maps each odd number to its square.
5. Collects the squared values into a list and prints them.

### Sample Input/Output
### Input:
```
10
```
### Output:
```
[1, 9, 25, 49, 81]
```

### Technologies Used
- Java
- Java Streams API (`Stream.iterate()`, `map()`, `collect()`)

### How to Run
1. Compile the program:
   ```
   javac OddNumbersSquare.java
   ```
2. Run the program:
   ```
   java OddNumbersSquare
   ```
3. Enter a number as input when prompted.


--------------------------------------------------------------
## [StartWithVowelAndLengthGreaterThanFive]()

### Description
This Java program processes a list of words and filters out the ones that:
1. Start with a vowel (case-insensitive).
2. Have a length greater than 5 characters.

The filtered words are collected and printed as output.

### How It Works
1. Reads an integer `N` from user input, representing the number of words.
2. Reads `N` words from input.
3. Uses Java Streams to filter words based on:
   - First character being a vowel (`a, e, i, o, u` in any case).
   - Length greater than 5.
4. Collects and prints the filtered words.

## Sample Input/Output
### Input:
```
5
Aeroplane
apple
egg
Dog
Orange
```
### Output:
```
[Aeroplane, apple, Orange]
```

### Technologies Used
- Java
- Java Streams API (`filter()`, `collect()`)
- Regular Expressions for filtering

### How to Run
1. Compile the program:
   ```
   javac StartWithVowel.java
   ```
2. Run the program:
   ```
   java StartWithVowel
   ```
3. Enter the number of words and the words themselves.



-------------------------------------------------------------
## [SortByLengthAndLexicographically]()

### Description
This Java program sorts a list of words based on:
1. Length (shorter words appear first).
2. Lexicographical order (case-insensitive) if words have the same length.

### How It Works
1. Reads an integer `N` from user input, representing the number of words.
2. Reads `N` words from input.
3. Uses Java Streams to sort words:
   - First by length (`Comparator.comparingInt(String::length)`).
   - Then lexicographically (`thenComparing(String::compareToIgnoreCase)`).
4. Collects and prints the sorted words.

### Sample Input/Output
### Input:
```
5
Apple
ball
ant
Banana
dog
```
### Output:
```
[Apple, Banana, ant, ball, dog]
```

### Technologies Used
- Java
- Java Streams API (`sorted()`, `collect()`)
- Comparator chaining for sorting

### How to Run
1. Compile the program:
   ```
   javac SortByLengthAndLexicographically.java
   ```
2. Run the program:
   ```
   java SortByLengthAndLexicographically
   ```
3. Enter the number of words and the words themselves.

--------------------------------------------------------------

### 💡 How to Use


1. Clone the repository:
   ```sh
   git clone https://github.com/lalitpatil891/CodeWithJava.git
   ```
2. Open the project in any Java IDE (Eclipse, IntelliJ, or VS Code).
3. Run individual programs as needed.
