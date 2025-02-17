import java.util.ArrayList;

class CabCustomerService {
	private ArrayList<CabCustomer> customerList = new ArrayList<>();

	// Add customer to the list
	public void addCabCustomer(CabCustomer customer) {
		customerList.add(customer);
	}

	// Check if the customer is an existing customer
	public boolean isFirstCustomer(CabCustomer customer) {
		for (CabCustomer c : customerList) {
			if (c.getPhone().equals(customer.getPhone())) {
				return false; // Customer exists
			}
		}
		return true; // New customer
	}

	// Calculate bill
	public double calculateBill(CabCustomer customer) {
		if (isFirstCustomer(customer)) {
			return 0; // New customers get free ride
		}
		int distance = customer.getDistance();
		if (distance <= 4) {
			return 80;
		} else {
			return 80 + (distance * 6);
		}
	}

	// Print bill
	public void printBill(CabCustomer customer) {
		double billAmount = calculateBill(customer);
		System.out.println(customer.getCustomerName() + " Please pay your bill of Rs." + billAmount);
	}
}
