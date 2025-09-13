public class CabCustomerServiceTester {
    public static void main(String[] args) {
        CabCustomerService service = new CabCustomerService();

        // Creating customer objects
        CabCustomer c1 = new CabCustomer(101, "John", "HYD", "KCG", 5, "9876543210");
        CabCustomer c2 = new CabCustomer(102, "Smith", "AmirPet", "panjagutta", 6, "1234567890");
        CabCustomer c3 = new CabCustomer(103, "John", "andheri", "mumbai", 4, "9876543210");

        // Adding customers
        service.addCabCustomer(c1);
        service.addCabCustomer(c2);

        // Printing bills
        service.printBill(c1); // First-time user, bill should be Rs.0.0
        service.printBill(c2); // Existing user, bill should be calculated
        service.printBill(c3); // John booking again, bill should be calculated
    }
}
