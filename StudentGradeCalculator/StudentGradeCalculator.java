// StudentGradeCalculator.java
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Marks: ");
        int marks = scanner.nextInt();

        Student student = new Student(name, marks);
        StudentGrade studentGrade = CalculateStudentGrade.calculateGrade(student);

        System.out.println(studentGrade);

        scanner.close();
    }
}
