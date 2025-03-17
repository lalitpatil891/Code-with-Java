/*Program 01:
-----------
Write a  program in Java that will generate and print the bill at Dominos for four chicken rolls (@ Rs 60 per chicken rolls) and three vegetable puffs (@ Rs 25 per vegetable puffs). There is a special discount of Rs 50 on the final bill amount. Calculate and print final bill as well as all item bill.*/

package com.nit.dominos_bill_generate;

public class DominosBill {

	public static void main(String[] args) {
		int chickenRolls = 60;
		int vegetablePuffs = 25;

		int chickenRollsQty = 4;
		int vegetablePuffsQty = 3;

		int discount = 50;

		int chickenRollTotal = chickenRolls * chickenRollsQty;
		int vegetablePuffsTotal = vegetablePuffs * vegetablePuffsQty;

		int totalBillBeforeDiscount = chickenRollTotal + vegetablePuffsTotal;

		int totalBill = totalBillBeforeDiscount - discount;

		System.out.println("-----Dominos Bill-----");
		System.out.println("-------------------------------------------------------");
		System.out.println("Chiken Rolls (4 x Rs. 60): " + chickenRollTotal);
		System.out.println("vegetablePuffsQty (3 x Rs. 25): " + vegetablePuffsTotal);
		System.out.println("-------------------------------------------------------");
		System.out.println("Discout Rs.: " + discount);
		System.out.println("-------------------------------------------------------");
		System.out.println("Total bill: " + totalBill);

	}
}
