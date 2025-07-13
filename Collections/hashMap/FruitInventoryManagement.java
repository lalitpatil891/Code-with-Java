/**FruitInventoryManagement
------------------------
You are tasked with implementing a simple Java program that manages a collection of fruits and their quantities using a HashMap.
Create a ELC class FruitInventoryManagement :
Add fruits and their quantities to the HashMap.
Display the total number of entries in the HashMap.
Check if the HashMap is empty.
Retrieve and print the quantity of a specific fruit.
Check if a specific fruit exists in the HashMap.
Check if a specific quantity exists in the HashMap.

Sample Output :
Added Apple: 50
Added Banana: 30
Added Orange: 20
Total number of entries: 3
HashMap is not empty.

Quantity for Apple: 50
Quantity for Banana: 30

Orange exists in the records.
Mango does not exist in the records.

Quantity 20 exists in the records.
Quantity 100 does not exist in the records.
Sample Input
Added Apple: 50
Added Banana: 30
Added Orange: 20
Sample Output
Total number of entries: 3
HashMap is not empty.

Quantity for Apple: 50
Quantity for Banana: 30

Orange exists in the records.
Mango does not exist in the records.

Quantity 20 exists in the records.
Quantity 100 does not exist in the records.
*/

package com.nit.hashMap;

import java.util.HashMap;
import java.util.Map;

public class FruitInventoryManagement {

    public static void main(String[] args) {
        // Initialize HashMap to store fruits and their quantities
        Map<String, Integer> fruitInventory = new HashMap<>();

        // Adding fruits to the inventory
        addFruit(fruitInventory, "Apple", 50);
        addFruit(fruitInventory, "Banana", 30);
        addFruit(fruitInventory, "Orange", 20);

        // Display total number of entries
        System.out.println("Total number of entries: " + fruitInventory.size());

        // Check if the HashMap is empty
        if (fruitInventory.isEmpty()) {
            System.out.println("HashMap is empty.\n");
        } else {
            System.out.println("HashMap is not empty.\n");
        }

        // Retrieve and print quantities for specific fruits
        printQuantity(fruitInventory, "Apple");
        printQuantity(fruitInventory, "Banana");

        // Check if specific fruits exist
        checkFruitExists(fruitInventory, "Orange");
        checkFruitExists(fruitInventory, "Mango");

        // Check if specific quantities exist
        checkQuantityExists(fruitInventory, 20);
        checkQuantityExists(fruitInventory, 100);
    }

    // Method to add fruit to the inventory
    private static void addFruit(Map<String, Integer> inventory, String fruit, int quantity) {
        inventory.put(fruit, quantity);
        System.out.println("Added " + fruit + ": " + quantity);
    }

    // Method to print quantity of a specific fruit
    private static void printQuantity(Map<String, Integer> inventory, String fruit) {
        if (inventory.containsKey(fruit)) {
            System.out.println("Quantity for " + fruit + ": " + inventory.get(fruit));
        } else {
            System.out.println(fruit + " does not exist in the records.");
        }
    }

    // Method to check if a fruit exists
    private static void checkFruitExists(Map<String, Integer> inventory, String fruit) {
        if (inventory.containsKey(fruit)) {
            System.out.println(fruit + " exists in the records.");
        } else {
            System.out.println(fruit + " does not exist in the records.");
        }
    }

    // Method to check if a quantity exists
    private static void checkQuantityExists(Map<String, Integer> inventory, int quantity) {
        if (inventory.containsValue(quantity)) {
            System.out.println("Quantity " + quantity + " exists in the records.");
        } else {
            System.out.println("Quantity " + quantity + " does not exist in the records.");
        }
    }
}

/*OUTPUT

Added Apple: 50
Added Banana: 30
Added Orange: 20
Total number of entries: 3
HashMap is not empty.

Quantity for Apple: 50
Quantity for Banana: 30
Orange exists in the records.
Mango does not exist in the records.
Quantity 20 exists in the records.
Quantity 100 does not exist in the records.
*/
