package com.nit.to_string;

public class Manager {
	
	private int managerId;
	private String managerName;
	
	public void setManagerData(int managerId, String managerName) {

		this.managerId = managerId;
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
	}


	
	
	
}
