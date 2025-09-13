### 🔑 **Serialization**

➡️ **Serialization** means converting a **Java object into a byte stream**, so that it can be **saved into a file** or **transferred over a network**.

---

### 🔑 **Deserialization**

➡️ **Deserialization** means converting that **byte stream back into the original Java object**.
This allows us to **restore** the object and use it again in our program.

---

### 📌 Example

```java
// Serialization
ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
oos.writeObject(myList);   // Object is stored in file
oos.close();

// Deserialization
ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
ArrayList list = (ArrayList) ois.readObject(); // Object is restored from file
ois.close();
```

---

### ✅ In short:

* **Serialization** → Storing an object into file/network (convert object → byte stream).
* **Deserialization** → Restoring the object back (convert byte stream → object).

---
