/**ArrayToList
Write a Java program to convert Array to List.
A BLC class called ArrayToList is given to you.
Add a static method: convertToList(String[] inputArray) : This method 
takes an array of strings as an argument. It should convert the given 
array to a list of Strings and return this list. 
Note that the length of the list must be the same as that of the array. 
Return null for errors a null array or an empty list for an empty 
array.
An ELC Class called Tester with the main method is given to you. Use 
this class to test your solution
Sample Input
3
Apple
Banana
Mango
Sample Output
Converted List: [Apple, Banana, Mango]*/

package com.nit.convert_the_arraylist_to_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ArrayToList {
	
	public static List<String> convertToList(String[] inputArray) {
		
		return new ArrayList<>(Arrays.asList(inputArray));
	}
}


public class Tester {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String [] inputArray = new String[n];
		
		for(int i=0; i<n ; i++)
		{
			inputArray[i] = sc.nextLine();
		}
		
		List<String> resultList = ArrayToList.convertToList(inputArray);
		
		System.out.println("Converted List : "+resultList);
		
		sc.close();
	}
}

/**import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


class ArrayToListTester{
	
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the size");
       
    int size = sc.nextInt();
    String[] str = new String[size];

    for(int i=0;i<size;i++){
        str[i]=sc.next();
    }
    
    List<String> list =BLC.convertToList(str); //here call the method with help of Class name because this is static method 
    System.out.println("Converted List: "+list);
    }
    
}

class BLC{
    public static List<String> convertToList(String[] inputArray) {
        return Arrays.asList(inputArray);
    }
}
*/
