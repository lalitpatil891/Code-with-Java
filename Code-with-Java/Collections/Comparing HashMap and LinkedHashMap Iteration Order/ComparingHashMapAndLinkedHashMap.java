import java.util.*;

public class ComparingHashMapAndLinkedHashMap {

    public static void main(String[] args) {
        compareIterationOrder();
    }

    // Method to compare iteration order
    private static void compareIterationOrder() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Initialize HashMap and LinkedHashMap
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Taking input and inserting into both maps
        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            int key = sc.nextInt();
            System.out.print("Enter value: ");
            String value = sc.next();

            hashMap.put(key, value);
            linkedHashMap.put(key, value);
        }

        // Display HashMap iteration order
        System.out.println("\nHashMap iteration order:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Display LinkedHashMap iteration order
        System.out.println("\nLinkedHashMap iteration order:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}
