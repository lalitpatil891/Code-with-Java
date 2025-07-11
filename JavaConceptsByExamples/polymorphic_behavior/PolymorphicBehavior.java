package com.nit.polymorphic_behavior;

class payment {
	public double makePayment(double amount) {

		System.out.println("payment is in process...");

		return 0.0;
	}
}

class UPI extends Payment {
	@Override
	public double makePayment(double amount) {
		System.out.println("Making a payment of " + amount + " using UPT");

		return amount;
	}
}

class CreditCard extends Payment {
	@Override
	public double makePayment(double amount) {
		System.out.println("Making a payment of " + amount + " using Credit Card");

		return amount;
	}
}

public class polymorphicBehavior {
	public static void main(String[] args) {
		Payment p1 = null;
		p1 = new UPI();
		acceptPayment(p1);

		p1 = new CreditCard();
		acceptPayment(p1);
	}

	public static void acceptPayment(Payment payment) {
		payment.makePayment(12000);
	}

}
