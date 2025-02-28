// VehicleTest.java - Main class to demonstrate Dynamic Polymorphism
public class VehicleTest {
    public static void main(String[] args) {
        // Reference of type Vehicle pointing to different objects (Dynamic Polymorphism)
        Vehicle vehicle;

        vehicle = new Car();
        vehicle.start();  // Calls Car's start method

        vehicle = new Bike();
        vehicle.start();  // Calls Bike's start method

        vehicle = new Truck();
        vehicle.start();  // Calls Truck's start method
    }
}
