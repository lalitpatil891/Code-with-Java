package com.nit.bank_application_project;

public class SavingsAccount extends BankAccount {

	protected double interestRate = 4.0;

	public SavingsAccount(String accountHolderName, String accountNumber, double balance) {
		super(accountHolderName, accountNumber, balance);
	}

	@Override
	public void calculateInterest() {
		double interest = (balance * interestRate) / 100;

		System.out.println("Savings Account Interest Rs:" + interest);
	}
}
