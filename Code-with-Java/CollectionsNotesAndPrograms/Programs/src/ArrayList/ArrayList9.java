package ArrayList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayList9 {

	public static void main(String[] args) {

		ArrayList<String> listOfIceCream = new ArrayList<>();
		listOfIceCream.add("Vanila");
		listOfIceCream.add("Strawberry");
		listOfIceCream.add("Butter Scotch");

		// Serialization
		try (var fos = new FileOutputStream("D:\\new\\IceCream.txt"); var oos = new ObjectOutputStream(fos)) {

			oos.writeObject(listOfIceCream);
			System.out.println("Object Stored Successfully!!!");

		} catch (Exception e) {
			e.printStackTrace();
		}

		// De-Serialization
		try (var fin = new FileInputStream("D:\\new\\IceCream.txt"); var ois = new ObjectInputStream(fin)) {

			ArrayList<String> list = (ArrayList<String>) ois.readObject();
			System.out.println("List Data : " + list);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
