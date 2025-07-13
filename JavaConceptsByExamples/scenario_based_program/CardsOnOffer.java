package com.nit.scenario_based_program;

public class CardsOnOffer {
	
	public static CardType getOfferedCard(Customer object) {
		
		int creditPoint = object.getCreditPoints();
		
		if(creditPoint >= 100 && creditPoint <= 500)
		{
			return new CardType(object, "Silver");
		}
		else if(creditPoint >= 501 && creditPoint <= 1000)
		{
			return new CardType(object, "Gold");
		}
		else if(creditPoint > 1000)
		{
			return new CardType(object, "Platinum");
		}
		else
		{
			return new CardType(object, "EMI");
		}
	}
}
