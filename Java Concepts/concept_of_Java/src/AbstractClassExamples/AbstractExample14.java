package AbstractClassExamples;

/* 
14) Can we keep static initialization blocks inside an abstract class?
Answer :
Yes. Abstract classes can have static initialization blocks as well as instance initialization blocks.
 */


abstract class AB {

    // Static initialization block
    static {
        System.out.println("Static Block of AB");
    }

    // Instance initialization block
    {
        System.out.println("Instance Block of AB");
    }

    // Constructor
    AB() {
        System.out.println("Constructor of AB");
    }
}

class BC extends AB {

    BC() {
        System.out.println("Constructor of BC");
    }
}



public class AbstractExample14 {

	public static void main(String[] args) {
        BC b = new BC();   // Create object	
	}
}

/*OUTPUT
 * 
 * Static Block of AB
 * Instance Block of AB
 * Constructor of AB
 * Constructor of BC
 * 
 * Static block runs first → only once when class A loads.

Instance block runs before parent constructor whenever object is created.
Parent constructor (A) runs next.
Child constructor (B) runs last.
 * */

