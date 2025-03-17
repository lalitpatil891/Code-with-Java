/**Set:B_Q2_Scenario: Devloping  Job Portal Simulations */

package com.nit.exam_21_dec_devloping_job_portal_simulation;

public class JobPortalSimulator {

	public static void main(String[] args) {
		// Create instances of JobPortal, PremiumJobPortal, and FreelanceJobPortal
        JobPortal generalPortal = new JobPortal("Generic Job Portal", false, 500);
        PremiumJobPortal premiumPortal = new PremiumJobPortal("Premium Job Portal");
        FreelanceJobPortal freelancePortal = new FreelanceJobPortal("Freelance Job Portal");

        // Create an instance of RevenueAnalyzer
        RevenueAnalyzer analyzer = new RevenueAnalyzer();

        // Analyze earnings for each portal
        analyzer.analyze(generalPortal, 10, 15); // Example: 10 and 15 users
        System.out.println("------------------------");
        analyzer.analyze(premiumPortal, 20, 25); // Example: 20 and 25 users
        System.out.println("--------------------------");
        analyzer.analyze(freelancePortal, 5, 10); // Example: 5 and 10 users
	}

}
