import java.util.*;

public class EnumerationExample {
    public static void main(String[] args) {
        // Creating a legacy Vector collection
        Vector<String> names = new Vector<>();
        names.add("Lalit");
        names.add("Amit");
        names.add("Sneha");
        names.add("Ravi");

        // Getting Enumeration object
        Enumeration<String> e = names.elements();

        // Traversing using Enumeration
        while (e.hasMoreElements()) {
            String name = e.nextElement();
            System.out.println(name);
        }
    }
}
