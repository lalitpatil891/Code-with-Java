package com.nit.student_grade_based_on_student_marks_0001;

public class StudentGrade {
	
	private Student student;
	private char StudentGrade;
	
	public StudentGrade(Student student, char studentGrade) {
		super();
		this.student = student;
		StudentGrade = studentGrade;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public char getStudentGrade() {
		return StudentGrade;
	}
	
	public void setStudentGrade(char studentGrade) {
		StudentGrade = studentGrade;
	}
	
	@Override
	public String toString() {
		return student+ ",has " + StudentGrade + " Grade ]";
	}
	
	
}
