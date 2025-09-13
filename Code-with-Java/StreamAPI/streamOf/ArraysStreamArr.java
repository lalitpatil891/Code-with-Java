/**
 * 2) Arrays.stream(T[] arr)
 * 
 * 
 */

package streamAPI.streamOf;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;

public class ArraysStreamArr {

	public static void main(String[] args) {
		
		int []arr = {10,20,30,40,50};
		
		IntStream stream1 = Arrays.stream(arr);
		stream1.forEach(System.out::println);
		
		System.out.println("---------------------------------");
		
		long []arr2 = {10L, 20L, 30L, 40L, 50L};
		
		LongStream stream2 = Arrays.stream(arr2);
		stream2.forEach(System.out::println);
		
		System.out.println("---------------------------------");
		
		double []arr3 = {12.23, 34.43, 56.45, 11.32, 59.60};
		
		DoubleStream stream3 = Arrays.stream(arr3);
		
		stream3.forEach(x -> System.out.println(x));
		
		
		
		
		
		
		
	}

}
