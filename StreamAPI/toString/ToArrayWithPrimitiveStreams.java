/**
 *  toArray() with Primitive Streams
 *  
 *  for primitive Streams(IntStream, LongStream, DoubleStream), toArray() directly returns an array of the corresponding type.
 * 
 */

package com.nit.toString;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ToArrayWithPrimitiveStreams {

	public static void main(String[] args) {

		int [] numbers = IntStream.range(1,6).toArray();
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("--------------------------------");
		
		int [] num = IntStream.range(5, 10).toArray();
		
		System.out.println(Arrays.toString(num));
		
	}
}

/**
 * ✔️ toArray() collects stream elements into an array.
 * ✔️ Use toArray(T[]::new) for typed arrays to avoid Object[].
 * ✔️ Works efficiently with primitive streams (IntStream,    DoubleStream, etc.).
*/
