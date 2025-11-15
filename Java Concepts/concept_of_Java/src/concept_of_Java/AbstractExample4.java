package concept_of_Java;
/*
 * Below code snippet is showing compilation error? Can you suggest the corrections?
 * -> Class B must implement inherited abstract method A.add() or else it must be declared as abstract.
*/

abstract class A {
    abstract void add();
}

class B extends A {
    @Override
    void add() {
        System.out.println("Add method implemented in B");
    }
}

public class AbstractExample4 {
	
	public static void main(String [] args)
	{
		 A a = new B();
	        a.add();  // Output: Add method implemented in B
	}
}

//ABC is an abstract class, so you cannot create an object of an abstract class.
