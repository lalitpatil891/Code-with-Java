import java.util.*;

public class ForLoopExample {
    public static void main(String[] args) {
        // Creating a List of names
        List<String> names = new ArrayList<>();
        names.add("Lalit");
        names.add("Amit");
        names.add("Sneha");
        names.add("Ravi");

        // Using an ordinary for loop to access elements
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
