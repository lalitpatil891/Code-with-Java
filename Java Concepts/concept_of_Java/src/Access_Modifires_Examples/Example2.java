package Access_Modifires_Examples;

class Parent {
    
    protected int value = 100;   // protected member
    
    protected void show() {
        System.out.println("Protected method from Parent");
    }
}

class Child extends Parent {   // Inheriting Parent
    
    public void display() {
        // Accessing protected member
        System.out.println("Value: " + value);
        
        // Calling protected method
        show();
    }
}

public class Example2 {
    
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
