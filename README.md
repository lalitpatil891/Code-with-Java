# 🚀 Java Projects Repository

## 📌 About This Repository

This repository contains Java-related tasks, projects, and practice exercises. It serves as a collection of Java programming concepts, covering fundamental and advanced topics, including real-world applications.

## 📂 Contents

- **🧵 Multithreading & Concurrency** – Covers thread creation, synchronization, executors, etc.
              
   1) [OLA Cab Booking Process - Multithreading in Java](#-ola-cab-booking-process---multithreading-in-java)

---------------------------------------------------------------------------------------------------------------------
### 🚖 OLA Cab Booking Process - Multithreading in Java    
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

## 🛠 How to Run

1. Clone the repository:
   ```sh
   git clone <repository_url>
   ```
2. Navigate to the project directory:
   ```sh
   cd ola-cab-booking
   ```
3. Compile and run the Java program:
   ```sh
   javac OlaRidingApp.java
   java OlaRidingApp
   ```

## 🏗 Technologies Used

- Java
- Multithreading (Thread class)
- `join()` and `start()` methods for execution sequence

## 💡 How to Use

1. Clone the repository:
   ```sh
   git clone [https://github.com/your-username/your-repository.git](https://github.com/lalitpatil891/CodeWithJava.git)
   ```
2. Open the project in any Java IDE (Eclipse, IntelliJ, or VS Code).
3. Run individual programs as needed.

## 🤝 Contributions & Feedback

Feel free to fork this repository, raise issues, or suggest improvements.

## 📜 License

This project is open-source and can be modified as needed.

