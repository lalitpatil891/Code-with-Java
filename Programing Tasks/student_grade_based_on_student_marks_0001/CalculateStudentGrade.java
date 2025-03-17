package com.nit.student_grade_based_on_student_marks_0001;

public class CalculateStudentGrade {

	public static StudentGrade calculateGrade(Student stu) {
		int mark = stu.getMarks();
		char studentGrade = '\u0000';
		if(mark > 90)
		{
			studentGrade ='A';
		}
		else if(mark >= 75)
		{
			studentGrade ='B';
		}
		else if(mark >= 60)
		{
			studentGrade = 'C';
		}
		else {
			studentGrade = 'D';
		}
		
		return new StudentGrade(stu, studentGrade);
			
	
	}
}
