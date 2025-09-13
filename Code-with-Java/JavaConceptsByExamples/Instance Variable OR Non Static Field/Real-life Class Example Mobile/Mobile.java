public class Mobile {
    String brand;
    String model;
    double price;

    // Method with no parameter
    public void setMobileData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Brand: ");
        brand = sc.nextLine();
        System.out.print("Enter Model: ");
        model = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
        sc.close();
    }

    // Method with parameters
    public void setMobileData(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    public void getMobileData() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }
}
