package com.nit.scenario_based_program;

public class Test {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("Lalit Patil", 501);
	
		CardType offeredCard = CardsOnOffer.getOfferedCard(c1);
		
		System.out.println(offeredCard);
		
		
	}

}
