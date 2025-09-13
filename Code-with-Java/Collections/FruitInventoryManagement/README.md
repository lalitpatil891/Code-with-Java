## FruitInventoryManagement

### Overview
The **FruitInventoryManagement** Java program manages a collection of fruits and their quantities using a `HashMap`. It allows adding fruits, checking inventory details, and querying for specific fruits and quantities.

### Features
- **Add Fruits:** Add fruits and their quantities to the inventory.
- **Display Total Entries:** Shows the total number of fruits in the inventory.
- **Check if Inventory is Empty:** Verifies if the inventory has any entries.
- **Retrieve Fruit Quantity:** Fetches the quantity of a specific fruit.
- **Check Fruit Existence:** Confirms if a particular fruit exists in the inventory.
- **Check Quantity Existence:** Verifies if a specific quantity exists in the inventory.

### How to Run
1. **Compile the program:**
   ```bash
   javac FruitInventoryManagement.java
   ```

2. **Run the program:**
   ```bash
   java FruitInventoryManagement
   ```

### Sample Output
```
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
```

### Code Structure
- **Class:** `FruitInventoryManagement`
- **Data Structure:** `HashMap<String, Integer>` to store fruit names and quantities.

### Methods
- `addFruit(Map<String, Integer> inventory, String fruit, int quantity)`: Adds a fruit to the inventory.
- `printQuantity(Map<String, Integer> inventory, String fruit)`: Prints the quantity of a specific fruit.
- `checkFruitExists(Map<String, Integer> inventory, String fruit)`: Checks if a fruit exists.
- `checkQuantityExists(Map<String, Integer> inventory, int quantity)`: Checks if a quantity exists.

Enjoy managing your fruits! 🍎🍌🍊
