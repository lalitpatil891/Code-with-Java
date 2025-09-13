package com.nit.payroll_system;

public class Sourcing {

	int sourceId;
	String sourceName;
	double basicSalary;
	double HRAPer;
	double DAPer;
	int batchCount;
	int perkPerBatch;
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;
	

	public Sourcing(int sourceId, String sourceName, double basicSalary, double hRAPer, double dAPer, int batchCount,
			int perkPerBatch, int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
		super();
		this.sourceId = sourceId;
		this.sourceName = sourceName;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}



	public double calculateGrossSalary()
	{
		return basicSalary +HRAPer +DAPer +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
	}



	@Override
	public String toString() {
		return "Sourcing [sourceId=" + sourceId + ", sourceName=" + sourceName + ", basicSalary=" + basicSalary
				+ ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + ", batchCount=" + batchCount + ", perkPerBatch="
				+ perkPerBatch + ", enrollmentTarget=" + enrollmentTarget + ", enrollmentReached=" + enrollmentReached
				+ ", perkPerEnrollment=" + perkPerEnrollment + "]";
	}
	
	
}
