/**Set:A_Q2_Scenario: Movie Theater Simulation System */

package com.nit.exam_21_dec_movie_theater_simulation_system;

public class MovieExperienceSimulator {

	public static void main(String[] args) {

		// Create instances of Theater, IMAXTheater, and PremiumTheater
		Theater generalTheater = new Theater("Generic Theater", false, 300);
		IMAXTheater imaxTheater = new IMAXTheater("IMAX Experience", true, 0);
		PremiumTheater premiumTheater = new PremiumTheater("Luxury Cinema", true, 0);

		// Create RevenueAnalyzer instance
		RevenueAnalyzer analyzer = new RevenueAnalyzer();

		// Analyze revenue for each theater type
		analyzer.analyze(generalTheater, 5, 10);
		analyzer.analyze(imaxTheater, 3, 7);
		analyzer.analyze(premiumTheater, 2, 6);

	}

}
