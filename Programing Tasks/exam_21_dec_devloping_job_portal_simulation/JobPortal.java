/**Set:B_Q2_Scenario: Devloping  Job Portal Simulations */

package com.nit.exam_21_dec_devloping_job_portal_simulation;

public class JobPortal {

	private String portalName;
	protected boolean isPremium;
	protected int subscriptionFee;

	public JobPortal(String portalName, boolean isPremium, int subscriptionFee) {
		this.portalName = portalName;
		this.isPremium = isPremium;
		this.subscriptionFee = subscriptionFee;
	}

	public int calculateEarnings(int... users) {
		int totalUsers = 0;
		for (int user : users) {
			totalUsers += user;
		}
		return totalUsers * subscriptionFee;
	}

	public JobPortal getPortalDetails() {

		return this;
	}
	
	public String getPortalName() {
		return portalName;
	}
	

}

class PremiumJobPortal extends JobPortal {

	public PremiumJobPortal(String portalName) {
		super(portalName, true, 2000);
	}

	@Override
	public int calculateEarnings(int... users) {
		int totalUsers = 0;
		for (int user : users) {
			totalUsers += user;
		}
		return totalUsers * subscriptionFee;
	}

	@Override
	public PremiumJobPortal getPortalDetails() {
		return this;
	}
}

class FreelanceJobPortal extends JobPortal {

	public FreelanceJobPortal(String portalName) {
		super(portalName, false, 1000);
	}

	@Override
	public int calculateEarnings(int... users) {
		int totalUsers = 0;
		for (int user : users) {
			totalUsers += user;
		}
		return totalUsers * subscriptionFee;
	}
	
	
	@Override
	public FreelanceJobPortal getPortalDetails() {

		return this;
	}

}