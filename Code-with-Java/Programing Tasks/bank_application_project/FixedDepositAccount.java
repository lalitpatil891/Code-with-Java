package com.nit.bank_application_project;

public class FixedDepositAccount extends BankAccount {

	protected double interestRate = 6.5;
	protected int depositTerm;

	public FixedDepositAccount(String accountHolderName, String accountNumber, double balance, int depositTerm) {
		super(accountHolderName, accountNumber, balance);

		if (depositTerm <= 0) {
			System.err.println("Deposit term must be positive.");
		} else {
			this.depositTerm = depositTerm;
		}
	}

	@Override
	public void calculateInterest() {
		double interest = (balance * interestRate * depositTerm) / 100;

		System.out.println("Fixed Deposit interest for " + depositTerm + " years Rs : " + interest);
	}
}
