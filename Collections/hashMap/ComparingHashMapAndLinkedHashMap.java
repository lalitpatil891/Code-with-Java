/**
ComparingHashMapAndLinkedHashMap [25-FEB-2025]
Comparing Iteration Order in HashMap and LinkedHashMap
Objective:
Write a Java program to compare the iteration order of HashMap and LinkedHashMap. The program should demonstrate how these two data structures store and iterate over their elements.

Create a ELC class :

Create a method compareIterationOrder():
method name : compareIterationOrder()
modifiers : private, static
return type : void
Initialize two maps: a HashMap and a LinkedHashMap.
Insert the same set of key-value pairs into both maps from and int[] of numbers and String[] of numbers.

Iterate through each map and print the keys and values to show the difference in iteration order.
Use the provided keys and values: {1, "One"}, {2, "Two"}, {3, "Three"}, {4, "Four"}, {5, "Five"}.

In the main method, call compareIterationOrder() to execute the comparison.

Test case 1 :
Input:
{1, "One"}, {2, "Two"}, {3, "Three"}, {4, "Four"}, {5, "Five"}
Expected Output:
HashMap iteration order:
3 -> Three
5 -> Five
1 -> One
2 -> Two
4 -> Four

LinkedHashMap iteration order:
1 -> One
2 -> Two
3 -> Three
4 -> Four
5 -> Five

Test Case 2:
Input:
{10, "Ten"}, {20, "Twenty"}, {30, "Thirty"}, {40, "Forty"}, {50, "Fifty"}
Expected Output:
HashMap iteration order:
30 -> Thirty
50 -> Fifty
10 -> Ten
20 -> Twenty
40 -> Forty

LinkedHashMap iteration order:
10 -> Ten
20 -> Twenty
30 -> Thirty
40 -> Forty
50 -> Fifty
------------------------------------

For Taking input from scanner use given scenario

Enter number of elements:
5
Enter key
10
Enter value
Ten
Enter key
20
Enter value
Twenty
Enter key
30
Enter value
Thirty
Enter key
40
Enter value
Forty
Enter key
50
Enter value
Fifty
HashMap iteration order:
50 -> Fifty
20 -> Twenty
40 -> Forty
10 -> Ten
30 -> Thirty
-------
Output:-
LinkedHashMap iteration order:
10 -> Ten
20 -> Twenty
30 -> Thirty
40 -> Forty
50 -> Fifty

----------------------------
Sample Input
5
10
Ten
20
Twenty
30
Thirty
40
Forty
50
Fifty
Sample Output
HashMap iteration order:
50 -> Fifty
20 -> Twenty
40 -> Forty
10 -> Ten
30 -> Thirty

LinkedHashMap iteration order:
10 -> Ten
20 -> Twenty
30 -> Thirty
40 -> Forty
50 -> Fifty
*/

package com.nit.hashMap;

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
