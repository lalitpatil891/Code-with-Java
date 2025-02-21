# Employee Management System

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

## Contributing
Feel free to fork this repository, submit pull requests, or suggest improvements.
