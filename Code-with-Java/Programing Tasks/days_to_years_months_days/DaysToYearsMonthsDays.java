/**Program-4 ---- Java Basics(DAY 5)
----------
Write a program in java to input number of days. Find and display number of years, months and days.
=========================================*/

package com.nit.days_to_years_months_days;

import java.util.Scanner;

public class DaysToYearsMonthsDays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the nubmer of Days: ");
		int totalDays = sc.nextInt();

		int years = totalDays / 365;
		int remainingDaysAfterYears = totalDays % 365;
		int months = remainingDaysAfterYears / 30;
		int days = remainingDaysAfterYears % 30;

		// Display Result
		System.out.println("Years: " + years + ", Months: " + months + ", Days: " + days);

		sc.close();
	}
}

/*
INPUT
Enter the nubmer of Days: 500

OUTPUT
Years: 1, Months: 4, Days: 15
*/