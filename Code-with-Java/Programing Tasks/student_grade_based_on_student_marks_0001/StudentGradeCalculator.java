package com.nit.student_grade_based_on_student_marks_0001;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		
		Student stu = new Student("Lalit", 91);
		
		StudentGrade cal = CalculateStudentGrade.calculateGrade(stu);
		
		System.out.println(cal);
		
	}

}
