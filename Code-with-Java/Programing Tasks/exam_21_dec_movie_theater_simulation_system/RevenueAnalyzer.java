/**Set:A_Q2_Scenario: Movie Theater Simulation System */

package com.nit.exam_21_dec_movie_theater_simulation_system;

public class RevenueAnalyzer {

	public void analyze(Theater theater, int... tickets) {
		
		System.out.println("Analyzing" +(theater instanceof IMAXTheater ? "IMAX Theater" : theater instanceof PremiumTheater ? "PremiumTheater" : "General Theater") +"..."); 
		System.out.println(theater);
		int revenue = theater.calculateRevenue(tickets);
		
		System.out.println("Analyzing revenue for "+(theater instanceof IMAXTheater ? "IMAX Theater" : theater instanceof PremiumTheater ? "Premium Theter" :"General Theater")+"...");
		
		System.out.println("Total Revenue: "+revenue+"\n");
		
		
	}
}
