package com.nit.payroll_system;

public class Manager {
	
	

	int managerId;
	String managerName;
	double basicSalary;
	double HRAPer;
	double DAPer;
	double projectAllowance;
	
	public Manager(int managerId, String managerName, double basicSalary, double hRAPer, double dAPer,
			double projectAllowance) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.projectAllowance = projectAllowance;
	}
	
	public double calculateGrossSalary()
	{
		return basicSalary + HRAPer + DAPer + projectAllowance;
	}
	
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", basicSalary=" + basicSalary
				+ ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + ", projectAllowance=" + projectAllowance + "]";
	}
	
	
}
