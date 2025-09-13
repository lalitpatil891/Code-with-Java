package com.nit.assignment_12_dec_2024;

public class Animal {

	String name;

	Animal(String name) {
		this.name = name;
	}

	Animal() {
		this.makeRandomName();
		
	}

	String makeRandomName() {
		String name = "i";
		return name;
		
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.name);  //null
		Animal b = new Animal("Zeus");
		System.out.println(b.name); //Zeus
		
	}
}

/**
 * Output is :
 * 
 * 
 * 1.The main() method starts execution. 2. It creates an Animal object with the
 * default constructor (Animal()). 3. The default constructor calls the
 * makeRandomName() method to assign a name. 4. A second Animal object is
 * created with the parameterized constructor (Animal(String name)). 5. The
 * program prints the names of the two objects.
 * 
 * Execution Flow Diagram +----------------+ | Start main() | +----------------+
 * | v +--------------------------+ | Animal a = new Animal(); |
 * +--------------------------+ | v +-------------------------+ | Call Animal()
 * | +-------------------------+ | v +----------------------------------------+
 * | Call makeRandomName() -> return "i"; |
 * +----------------------------------------+ | v +---------------------------+
 * | a.name = "i" | +---------------------------+ | v
 * +--------------------------------+ | Animal b = new Animal("Zeus"); |
 * +--------------------------------+ | v +--------------------------+ | b.name
 * = "Zeus" | +--------------------------+ | v +-------------------------------+
 * | Print a.name -> "i" | +-------------------------------+ | v
 * +--------------------------------+ | Print b.name -> "Zeus" |
 * +--------------------------------+ | v +----------------+ | End main() |
 * +----------------+
 */