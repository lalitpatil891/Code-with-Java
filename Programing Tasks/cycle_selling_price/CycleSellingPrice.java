/**Program-2  - Java Basics(DAY 5)
----------
Rohan purchased an old cycle for Rs. 1200 and spend Rs. 250 on repairs, Rs. 350 in coloring and added new accessories worth Rs. 500. Rohan wants to make a profit of Rs. 1500 on selling the cycle. Find the selling price of the cycle. Write a java program to store all values and calculate and display the selling price.
=========================================*/

package com.nit.cycle_selling_price;

public class CycleSellingPrice {

	public static void main(String[] args) {
		double oldCycle = 1200;
		double repairs = 250;
		double coloring = 350;
		double accessories = 500;

		double sellingCycleProfit = 1500;

		double totalSpendMoney = oldCycle + repairs + coloring + accessories;

		double sellingPrice = totalSpendMoney + sellingCycleProfit;

		System.out.println("oldCycle : " + oldCycle);
		System.out.println("Repairs : " + repairs);
		System.out.println("Coloring : " + accessories);
		System.out.println("accessories : " + sellingCycleProfit);
		System.out.println("----------------------------------------");
		System.out.println("Final Selling price: Rs." + sellingPrice);
     }
}


/*
Output

oldCycle : 1200.0
Repairs : 250.0
Coloring : 500.0
accessories : 1500.0
----------------------------------------
Final Selling price: Rs.3800.0
*/


