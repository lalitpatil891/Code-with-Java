public class Test {
    int x = 100;

    public static void main(String[] args) {
        Test t = new Test();  // object creation
        System.out.println("x value is :" + t.x);  // ✔ correct
    }
}

//It gets memory only when an object is created.
