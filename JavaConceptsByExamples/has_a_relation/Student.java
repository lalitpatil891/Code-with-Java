package com.nit.has_a_relation;

public class Student {
	private int studentId;
	private String studentName;
	private int studentMarks;

	public Student(int studentId, String studentName, int studentMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [ Student ID =" + studentId + ", StudentName = " + studentName + ", Student Marks = "
				+ studentMarks + "]";
	}

	public get studentId() {
		return studentId;
	}

	public get studentName() {
		return studentName;
	}

	public get studentMarks() {
		return studentMarks;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}
}
