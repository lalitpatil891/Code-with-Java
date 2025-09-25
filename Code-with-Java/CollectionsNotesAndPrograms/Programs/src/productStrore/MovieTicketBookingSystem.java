package productStrore;

class Ticket {

	String movieName;
	double price;
	int quantity;
	String promo;

	public Ticket(String movieName, double price, int quantity, String promo) {
		this.movieName = movieName;
		this.price = price;
		this.quantity = quantity;
		this.promo = promo;
	}
}

//class PromoValidator
class PromoValidator {

	public String validatePromo(Ticket t) throws InvalidPromoException {
		String promoCode = t.promo;

		// Role 1: Promo code must not be null
		if (promoCode == null) {
			throw new InvalidPromoException("Invalid PromoCode");
		}

		// Role 2: Promo code must contains (-) separator.
		if (!promoCode.contains("-")) {
			throw new InvalidPromoException("Invalid PromoCode");
		}

		// Role 3: format must be <MovieName>-<DiscountPercent>.
		String parts[] = promoCode.split("-");
		String discountStr = parts[1];
		String movie = parts[0];

		if (!movie.equals(t.movieName)) {
			throw new InvalidPromoException("Invalid PromoCode");
		}

		int discount;
		try {
			discount = Integer.parseInt(discountStr);
		} catch (NumberFormatException e) {
			throw new InvalidPromoException("Invalid PromoCode");
		}

		if (discount < 5 || discount > 30) {
			throw new InvalidPromoException("Invalid PromoCode");
		}

		return "Valid Promo";
	}

	public double finalBill(Ticket t) {

		try {

			String result = validatePromo(t);
			if (!result.equals("Valid Promo")) {

				String parts[] = t.promo.split("-");
				String discountStr = parts[1];
				int discount = Integer.parseInt(discountStr);

				return t.price - (discount / 100.0 * t.price);
			}
		} catch (InvalidPromoException e) {
			// Invalid coupon → return original price
			return t.price;
		}
		return t.price;

	}
}

class InvalidPromoException extends Exception {

	public InvalidPromoException(String msg) {
		super(msg);
	}
}

public class MovieTicketBookingSystem {
	public static void main(String[] args) {

		Ticket t1 = new Ticket("Avatar", 300.0, 2, "Avatar-10");
		Ticket t2 = new Ticket("Avatar", 300.0, 3, "Titanic-40");

		PromoValidator promo = new PromoValidator();

		

		// test product 1
		try {
			System.out.println(promo.validatePromo(t1));
		} catch (InvalidPromoException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(promo.finalBill(t1));

		// Test product 2
		try {
			System.out.println(promo.validatePromo(t2));
		} catch (InvalidPromoException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(promo.finalBill(t2));
	}
}
