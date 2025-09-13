import java.util.*;

public class MethodReferenceExample {
    public static void main(String[] args) {
        // Creating a List of names
        List<String> names = Arrays.asList("Lalit", "Amit", "Sneha", "Ravi");

        // Using method reference to print each element
        names.forEach(System.out::println);
    }
}
