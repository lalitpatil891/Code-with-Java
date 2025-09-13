//Q1: Assignment-6
package com.nit.simple_vehicle_inheritance_in_java;

public class TestVehicle {

	public static void main(String[] args) {

		System.out.println("------------invalid Inputs----------------");
		// Test Case 1: Invalid Input
        Car invalidCar = new Car("Ford", "Fusion", -2022, 4);
        Bike invalidBike = new Bike("Honda", "CBR", 2021, "");

        System.out.println("-------------Valid Inputs----------------");
     // Test Case 2: Invalid Input
        Car car = new Car("Audi", "Q8", 2021, 4);
        System.out.println("Car Details: ");
        car.displayDetails();
        
        Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
        System.out.println("\nBike Details:");
        bike.displayDetails();
           
	}
}


/*OUTPUT

------------invalid Inputs----------------
Error Invalid Input
Error Invalid Input
-------------Valid Inputs----------------
Car Details: 
make: Audi
model: Q8
year: 2021
numberOfDoors: 4

Bike Details:
make: Yamaha
model: MT-07
year: 2020
Type: Sports 
*/