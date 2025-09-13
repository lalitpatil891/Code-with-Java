//WAP to calculate the student marks and find out the average.
import java.util.*;

class StudentMarksAverage
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int marks[] = null;
		int sum = 0;
		
		System.out.print("Enter the number of Subjects: ");
		int numSub = sc.nextInt();
		
		marks = new int[numSub];
		System.out.println("length:"+marks.length);
		
		for(int i=0; i<numSub; i++){
		
			System.out.print("Enter the Subject "+(i+1)+" mark : ");
			marks[i] = sc.nextInt();
			
			// Add each element to the sum
			sum += marks[i];
 		}
		
		System.out.println("-------------------------------------");
		System.out.println("Marks List: "+Arrays.toString(marks));
		System.out.println("sum of the all Subject: "+sum);
		System.out.println("Average is: "+(sum/numSub));	
	}
}
