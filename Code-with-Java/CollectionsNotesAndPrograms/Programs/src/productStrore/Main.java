package productStrore;

//Product.java
class Product {
	String name;
	double price;
	String coupon;

	// Constructor
	public Product(String name, double price, String coupon) {
		this.name = name;
		this.price = price;
		this.coupon = coupon;
	}
}

//validator class 
class Validator {

	public String validateCoupon(Product p) throws InvalidCouponException {
		String coupon = p.coupon;

		// Role 1: Coupon must not be null
		if (coupon == null) {
			throw new InvalidCouponException("Invalid Coupon");
		}

		// Role 2: Coupon must contain '-'
		if (!coupon.contains("-")) {
			throw new InvalidCouponException("Invalid Coupon");
		}

		String[] parts = coupon.split("-");
		if (parts.length != 2) {
			throw new InvalidCouponException("Invalid Coupon");
		}

		String productName = parts[0];
		String discountStr = parts[1];

		// Rule 3: Product name must match
		if (!productName.equals(p.name)) {
			throw new InvalidCouponException("Invalid Coupon");
		}

		// Rule 4: Discount must be integer between 10 and 25
		int discount;

		try {
			discount = Integer.parseInt(discountStr);
		} catch (NumberFormatException e) {
			throw new InvalidCouponException("Invalid Coupon");
		}

		if (discount < 10 || discount > 25) {
			throw new InvalidCouponException("Invalid Coupon");
		}

		return "Valid Coupon";
	}

	// Method to calculate net price
	public double netPrice(Product p) {
		try {
			String result = validateCoupon(p);
			if (result.equals("Valid Coupon")) {
				String[] parts = p.coupon.split("-");
				int discount = Integer.parseInt(parts[1]);
				return p.price - (discount / 100.0 * p.price);
			}
		} catch (InvalidCouponException e) {
			// Invalid coupon → return original price
			return p.price;
		}
		return p.price;
	}
}

//InvalidCouponException.java
class InvalidCouponException extends Exception {
	public InvalidCouponException(String msg) {
		super(msg);
	}
}

public class Main {

	public static void main(String[] args) {

		Product p1 = new Product("Mobile", 20000, "Mobile-15");
		Product p2 = new Product("Laptop", 50000, "Mobile-30");

		Validator v = new Validator();

		// test product 1
		try {
			System.out.println(v.validateCoupon(p1));
		} catch (InvalidCouponException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(v.netPrice(p1));

		// Test product 2
		try {
			System.out.println(v.validateCoupon(p2));
		} catch (InvalidCouponException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(v.netPrice(p2));
	}
}
