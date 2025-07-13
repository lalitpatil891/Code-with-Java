/**
 * 
 * 1) public static Optional<T> ofNullable(T x)
 * 
 * 4) public T orElse(T defaultValue);
 * -->	It will return the value, if available otherwise it will return the specified default value.
 * 
 * 
 * */

package streamAPI.optional_class_examples;

import java.util.*;

public class OptionalDemo2 {

	public static void main(String[] args) {
		
		String str = "India";
		String str1 = null;
	
		
		Optional<String> container = Optional.ofNullable(str);
		Optional<String> cont1 = Optional.ofNullable(str1);
		
		String val = container.orElse("No value in the container"); 
		
		String val1 = cont1.orElse("No value");
		
		
		System.out.println(val);
		
		System.out.println(val1);
	}

}
