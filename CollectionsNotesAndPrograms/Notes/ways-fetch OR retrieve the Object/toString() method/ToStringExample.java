import java.util.*;

public class ToStringExample {
    public static void main(String[] args) {
        // Creating a List of names
        List<String> names = new ArrayList<>();
        names.add("Lalit");
        names.add("Amit");
        names.add("Sneha");
        names.add("Ravi");

        // Using toString() method to print the list
        System.out.println(names);  // Internally calls names.toString()
    }
}
