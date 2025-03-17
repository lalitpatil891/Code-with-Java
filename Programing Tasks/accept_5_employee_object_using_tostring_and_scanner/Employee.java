package com.nit.accept_5_employee_object_using_tostring_and_scanner;

import java.util.Scanner;

class Employee {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    // Parameterized constructor
    public Employee(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    // Static method to get Employee object
    public static Employee getEmployeeObject() {
        Scanner scanner = new Scanner(System.in);
        int id;
        String name;
        double salary;

        // Get valid employee ID
        while (true) {
            System.out.print("Enter Employee ID (positive integer): ");
            id = scanner.nextInt();
            if (id > 0) {
                break;
            }
            System.out.println("Invalid input. Employee ID must be a positive integer.");
        }

        // Get valid employee name
        scanner.nextLine(); // Clear buffer
        while (true) {
            System.out.print("Enter Employee Name (non-empty): ");
            name = scanner.nextLine();
            if (!name.trim().isEmpty()) {
                break;
            }
            System.out.println("Invalid input. Employee Name must be non-empty.");
        }

        // Get valid employee salary
        while (true) {
            System.out.print("Enter Employee Salary (non-negative): ");
            salary = scanner.nextDouble();
            if (salary >= 0) {
                break;
            }
            System.out.println("Invalid input. Employee Salary must be non-negative.");
        }

        return new Employee(id, name, salary);
    }
    

    // Override toString method
    @Override
    public String toString() {
        return "Employee [ID: " + employeeId + ", Name: " + employeeName + ", Salary: " + employeeSalary + "]";
    }
}
