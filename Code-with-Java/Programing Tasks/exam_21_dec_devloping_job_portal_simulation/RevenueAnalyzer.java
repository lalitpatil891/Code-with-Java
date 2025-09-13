/**Set:B_Q2_Scenario: Devloping  Job Portal Simulations */ww

package com.nit.exam_21_dec_devloping_job_portal_simulation;

public class RevenueAnalyzer {
	
	public void analyze(JobPortal portal, int... users) {
		
		System.out.println("Analyzing "+portal.getPortalName()+"...");
		
		if(portal instanceof PremiumJobPortal) {
			System.out.println("Analyzing subscription earnings for Premium Job Portal...");
		}
		else if( portal instanceof FreelanceJobPortal) {
			
			 System.out.println("Analyzing subscription earnings for Freelance Job Portal...");
			
		}
		else
		{
			 System.out.println("Analyzing subscription earnings for General Job Portal...");
		}
		
		int earnings = portal.calculateEarnings(users);
		System.out.println("Total Earnings: "+earnings);
	}
}
