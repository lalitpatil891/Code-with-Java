package vector;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        // Create a Vector to store city names
        Vector<String> listOfCity = new Vector<>();

        // Add cities to the Vector
        listOfCity.add("Hyderabad");
        listOfCity.add("Pune");
        listOfCity.add("Indore");
        listOfCity.add("Bhubneswar");
        listOfCity.add("Kolkata");

        // Print the original list before sorting
        System.out.println("Before sorting: " + listOfCity);

        // Sort the list alphabetically using a lambda expression
        listOfCity.sort((s1, s2) -> s1.compareTo(s2));

        // Print the list after sorting
        System.out.println("After Sorting: " + listOfCity);

        // Remove the city at index position 2 ("Hyderabad", "Indore", ...)
        listOfCity.remove(2);

        // Print the list after removing element by index
        System.out.println(listOfCity);

        // Remove a specific city by value ("Kolkata")
        listOfCity.remove("Kolkata");

        // Print the final list after removing by object
        System.out.println(listOfCity);
    }
}

/**
 OUTPUT
 -----
 Before sorting: [Hyderabad, Pune, Indore, Bhubneswar, Kolkata]
 After Sorting: [Bhubneswar, Hyderabad, Indore, Kolkata, Pune]
 [Bhubneswar, Hyderabad, Kolkata, Pune]
 [Bhubneswar, Hyderabad, Pune]

 * */
