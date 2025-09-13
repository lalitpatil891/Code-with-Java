package com.nit.multilevel_inheritance;

class Student {
	protected int studentId;
	protected String studentName;
	protected String studentAddress;

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
}

class ScienceStudent extends Student {
	int phy, chem;

	public ScienceStudent(int studentId, String studentName, String studentAddress, int phy, int chem) {
		super(studentId, studentName, studentAddress);
		this.phy = phy;
		this.chem = chem;
	}

	@Override
	public String toString() {
		return "ScienceStudent [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + ", phy=" + phy + ", chem=" + chem + "]";
	}
}

class PCM extends ScienceStudent {
	protected int math;

	public PCM(int studentId, String studentName, String studentAddress, int phy, int chem, int math) {
		super(studentId, studentName, studentAddress, phy, chem);
		this.math = math;
	}

	@Override
	public String toString() {
		return "PCM [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", phy=" + phy + ", chem=" + chem + ", math=" + math + "]";
	}
}

public class MultiLevel {

	public static void main(String[] args) 
	{
		PCM p = new PCM(1, "Raj", "Ameerpet", 89, 90, 91);
		System.out.println(p);
	}
}
