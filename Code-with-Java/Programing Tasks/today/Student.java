package com.nit.today;

public class Student {
	int studentId;
	String name;
	double examFee;
	public Student(int studentId, String name, double examFee) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}
	
	public double payFee(double amount) {
		return examFee;
	}
	
	public String displayDetails() {
		return toString();
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
}

class DayScholar extends Student
{
	

	public DayScholar(int studentId, String name, double examFee) {
		super(studentId, name, examFee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DayScholar [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	
	
	
}
