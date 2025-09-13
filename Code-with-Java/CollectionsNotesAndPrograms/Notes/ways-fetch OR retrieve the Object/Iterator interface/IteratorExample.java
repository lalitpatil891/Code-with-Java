import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        // Creating a List of names
        List<String> names = new ArrayList<>();
        names.add("Lalit");
        names.add("Amit");
        names.add("Sneha");
        names.add("Ravi");

        // Getting Iterator
        Iterator<String> itr = names.iterator();

        // Traversing using Iterator
        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }
    }
}
