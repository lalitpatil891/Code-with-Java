/** Program-1 (Using CommandLine arguments)  ---Java Basics (DAY 5)
A shopkeeper buys a TV set for Rs. 32,500 and sells it at a profit of 27%. Apart from this a VAT of 12.7% and Service Charge is 3.87% is charged. Display total selling price, profit along with vat and service charge.

Sample Input/Output :
Cost Price: Rs. 32500.00
Profit (27%): Rs. 8775.00
Selling Price before VAT and Service Charge: Rs. 41275.00
VAT (12.7%): Rs. 5241.93
Service Charge (3.87%): Rs. 1597.34x`
Total Selling Price: Rs. 48114.27
=========================================*/

package com.nit.tv_selling_price_calculator;

import java.text.DecimalFormat;
public class TVSellingPriceCalculator {

	public static void main(String[] args) {
		// System.out.print("Cost Price: Rs.");
		Double costPrice = Double.parseDouble(args[0]);

		double profitPercentage = 0.27;

		double profit = costPrice * profitPercentage;

		System.out.println("CostPrice: " + profit);

		double vatPercentage = 12.7;

		double serviceChargePercentage = 3.87;

		double sellingPriceBeforeExtras = costPrice + profit;

		double vatAmount = (sellingPriceBeforeExtras * vatPercentage) / 100;

		double serviceChargeAmount = (sellingPriceBeforeExtras * serviceChargePercentage) / 100;

		double totalSellingPrice = sellingPriceBeforeExtras + vatAmount + serviceChargeAmount;

		// Display The results
		DecimalFormat df = new DecimalFormat("00000.00");
		
		System.out.println("Cost Price: Rs. " + df.format(costPrice));
		System.out.println("Profit " + profitPercentage + " : Rs." + df.format(profit));
		System.out.println("Selling Price before VAT and Service Charge: Rs. " + df.format(sellingPriceBeforeExtras));
		System.out.println("VAT " + vatPercentage + " : Rs." + df.format(vatAmount));
		System.out.println("Service Charge" + serviceChargePercentage + " : Rs." + df.format(serviceChargeAmount));
		System.out.println("Total Selling Price: Rs." + df.format(totalSellingPrice));
	}
}

/*OUTPUT

CostPrice: 8775.0
Cost Price: Rs. 32500.00
Profit 0.27 : Rs.08775.00
Selling Price before VAT and Service Charge: Rs. 41275.00
VAT 12.7 : Rs.05241.92
Service Charge3.87 : Rs.01597.34
Total Selling Price: Rs.48114.27

*/
