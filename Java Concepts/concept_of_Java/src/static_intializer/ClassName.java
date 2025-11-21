package static_intializer;

class ClassName {
    
    static {
        x = 100; // Valid: can assign value
        // System.out.println(x); // Invalid if printed before declaration
        System.out.println(ClassName.x); // Valid: access via class name
    }

    static int x; // Declaration of static variable

    
    public static void main(String[] args) {
        // Accessing static variable in main
        System.out.println("Value of x in main: " + x);

        // Creating object (optional)
        ClassName obj = new ClassName();
        System.out.println("Access via object: " + obj.x);
    }
}


/*
 * 	OUTPUT
 * 	100
 *	Value of x in main: 100
 * 	Access via object: 100
*/
