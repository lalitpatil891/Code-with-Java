public class MobileDemo {
    public static void main(String[] args) {
        // 1. Using Object Reference
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.model = "Galaxy S24";
        m1.price = 70000;
        m1.getMobileData();

        // 2. Using Method without Parameter
        Mobile m2 = new Mobile();
        m2.setMobileData();
        m2.getMobileData();

        // 3. Using Method with Parameter
        Mobile m3 = new Mobile();
        m3.setMobileData("Apple", "iPhone 15", 90000);
        m3.getMobileData();
    }
}
