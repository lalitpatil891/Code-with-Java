import java.text.DecimalFormat;

public class TVSellingPriceCalculator {
    public static void main(String[] args) {
        // Parsing cost price from command line argument
        Double costPrice = Double.parseDouble(args[0]);

        double profitPercentage = 0.27;
        double vatPercentage = 12.7;
        double serviceChargePercentage = 3.87;

        // Calculating profit
        double profit = costPrice * profitPercentage;
        double sellingPriceBeforeExtras = costPrice + profit;

        // Calculating VAT and service charge
        double vatAmount = (sellingPriceBeforeExtras * vatPercentage) / 100;
        double serviceChargeAmount = (sellingPriceBeforeExtras * serviceChargePercentage) / 100;
        double totalSellingPrice = sellingPriceBeforeExtras + vatAmount + serviceChargeAmount;

        // Display The results
        DecimalFormat df = new DecimalFormat("00000.00");

        System.out.println("Cost Price: Rs. " + df.format(costPrice));
        System.out.println("Profit (" + (profitPercentage * 100) + "%): Rs. " + df.format(profit));
        System.out.println("Selling Price before VAT and Service Charge: Rs. " + df.format(sellingPriceBeforeExtras));
        System.out.println("VAT (" + vatPercentage + "%): Rs. " + df.format(vatAmount));
        System.out.println("Service Charge (" + serviceChargePercentage + "%): Rs. " + df.format(serviceChargeAmount));
        System.out.println("Total Selling Price: Rs. " + df.format(totalSellingPrice));
    }
}
