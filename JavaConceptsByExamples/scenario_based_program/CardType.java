package com.nit.scenario_based_program;

public class CardType {
	
	private Customer customer;
	private String cardType;
	
	public CardType(Customer customer, String cardType) {
		super();
		this.customer = customer;
		this.cardType = cardType;
	}

	@Override
	public String toString() {
		return "The Customer '" + customer + "' Is Eligible For '" + cardType + "' Card. ";
	}
	
	
	public void display() {
		System.out.println("CustomerName: "+customer);
	}
	
}
