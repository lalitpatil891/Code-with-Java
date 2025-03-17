/**Set:A_Q1_Scenario: Courier Management System. */

package com.nit.exam_21_dec_courier_management_system;

public class CourierSystem {

	public static void main(String[] args) {

		Courier domesticCourier = new DomesticCourier(5.0);
		Courier internationalCourier = new InternationalCourier(3.0);

		Customer customer1 = new Customer("lalit", "7038898336", domesticCourier);
		Customer customer2 = new Customer("Bob", "9123456780", internationalCourier);

		customer1.displayCustomerDetails();
		customer2.displayCustomerDetails();
	}
}

/*OUTPUT

Customer Name: lalit
Contact Number: 7038898336
Courier Type: Domesticlalit
Weight: 5.0 kg.
Service: within the country
Total cost: 250.0Rs.

Customer Name: Bob
Contact Number: 9123456780
Courier Type: Internationallalit
Weight: 3.0 kg.
Service: Across countries
Total cost: 450.0Rs.

*/
