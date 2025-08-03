import java.util.*;

public class SpliteratorExample {
    public static void main(String[] args) {
        // Creating a List of names
        List<String> names = Arrays.asList("Lalit", "Amit", "Sneha", "Ravi");

        // Getting Spliterator
        Spliterator<String> spliterator = names.spliterator();

        // Traversing using forEachRemaining
        spliterator.forEachRemaining(name -> System.out.println(name));
    }
}
