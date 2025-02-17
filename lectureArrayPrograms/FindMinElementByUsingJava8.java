/**a) WAP to find the minimum element from array by using java * features OR Stream API*/
package logicalArray.lectureArrayPrograms;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindMinElementByUsingJava8 {

	public static void main(String[] args) {
		
		int a[] = {9,7,1,5,2,-9};
		
		OptionalInt min = Arrays.stream(a).min();
		min.ifPresent(System.out::println);	
	}
}
