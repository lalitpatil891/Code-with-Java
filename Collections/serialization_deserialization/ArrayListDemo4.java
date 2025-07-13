package com.nit.serialization_deserialization;

import java.io.FileOutputStream;
import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String[] args) throws IOException 
	  {
		ArrayList<String> listOfIceCream = new ArrayList<>();
		listOfIceCream.add("Vanila");
		listOfIceCream.add("Strwbarry");
		listOfIceCream.add("Butter Scotch");
		
		//Serialization
		var fos = new FileOutputStream("D:\\new\\IceCream.txt");
		var oos = new ObjectOutputStream(fos);
		
		try(oos; fos)
		{
			oos.writeObject(listOfIceCream);
			System.out.println("Object Stored Successfully!!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//De-Serialization 
		var fin = new FileInputStream("D:\\new\\IceCream.txt");
		var ois = new ObjectInputStream(fin);
		
		try(ois; fin)
		{
	       ArrayList<String> list =	(ArrayList<String>)	ois.readObject();
	       System.out.println("List Data :"+list);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	  }       

}
