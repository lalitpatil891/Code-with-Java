/**Q11) WAP to create student array object to hold multiple student object dynamically */

package logicalArray.lectureArrayPrograms;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

record Student(Integer id, String name, Integer age) {
}

public class holdMultiStudentObjDynamically {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Student []students;

		try (sc) {
			System.out.print("Enter size for student array object: ");
			int size = sc.nextInt();

			Student[] students = new Student[size];

			for (int i = 0; i < size; i++) {
				System.out.print("Enter id: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter name: ");
				String name = sc.nextLine();

				System.out.print("Enter Age: ");
				int age = sc.nextInt();

				students[i] = new Student(id, name, age);
			}

			System.out.println("Printing the student Object");
			
			for(Student stu : students)
			{
				System.out.println(stu);
			}
			//System.out.println(Arrays.toString(students));

		} catch (NegativeArraySizeException e) {
			System.err.println("Array size must be positive Integer");
		} catch (InputMismatchException e) {
			System.err.println("Input is Invalid");

		}

	}
}


/*OUTPUT

Enter size for student array object: 2
Enter id: 01
Enter name: lalit
Enter Age: 24
Enter id: 02
Enter name: sunil
Enter Age: 23
Printing the student Object
Student[id=1, name=lalit, age=24]
Student[id=2, name=sunil, age=23]

*/