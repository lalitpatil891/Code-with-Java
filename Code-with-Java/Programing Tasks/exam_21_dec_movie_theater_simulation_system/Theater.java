/**Set:A_Q2_Scenario: Movie Theater Simulation System */

package com.nit.exam_21_dec_movie_theater_simulation_system;

public class Theater {
	private String theaterName;
	protected boolean is3DEnabled;
	protected int ticketPrice;

	public Theater(String theaterName, boolean is3DEnabled, int ticketPrice) {
		this.theaterName = theaterName;
		this.is3DEnabled = is3DEnabled;
		this.ticketPrice = ticketPrice;
	}

	public int calculateRevenue(int... tickets) {
		int totalTickets = 0;
		for (int ticket : tickets) {
			totalTickets += ticket;
		}
		return totalTickets * ticketPrice;
	}

	public Theater getTheaterDetails() {
		return this;
	}

	@Override
	public String toString() {
		return "Theater [theaterName=" + theaterName + ", is3DEnabled=" + is3DEnabled + ", ticketPrice=" + ticketPrice
				+ "]";
	}
}

class IMAXTheater extends Theater {

	public IMAXTheater(String theaterName, boolean is3dEnabled, int ticketPrice) {
		super(theaterName, is3dEnabled, 600);
	}

	@Override
	public int calculateRevenue(int... tickets) {

		int totalTickets = 0;
		for (int ticket : tickets) {
			totalTickets += ticket;
		}
		return totalTickets * ticketPrice;
	}

	@Override
	public IMAXTheater getTheaterDetails() {
		return this;
	}

	@Override
	public String toString() {
		return "IMAX Theater: " + ticketPrice + "/ticket(Premium Experience)";
	}
}

class PremiumTheater extends Theater {

	public PremiumTheater(String theaterName, boolean is3dEnabled, int ticketPrice) {
		super(theaterName, is3dEnabled, 800);
	}

	@Override
	public int calculateRevenue(int... tickets) {

		int totalTickets = 0;
		for (int ticket : tickets) {
			totalTickets += ticket;
		}
		return totalTickets * ticketPrice;
	}

	@Override
	public PremiumTheater getTheaterDetails() {
		return this;
	}

	@Override
	public String toString() {
		return "Premium Theater: " + ticketPrice + "/ticket(Premium Experience)";
	}

}
