package com.nit.bank_application_project;

public class BankAccount {
	protected String accountHolderName;
	protected String accountNumber;
	protected double balance;
	public static final String IFSC_CODE = "SBIN000435";

	public BankAccount(String accountHolderName, String accountNumber, double balance) {

		if (accountHolderName != null) {
			this.accountHolderName = accountHolderName;
		} else {
			System.err.println("Account holder name cannot be empty.");
		}

		if (accountNumber != null) {
			this.accountNumber = accountNumber;
		} else {
			System.err.println("Account Number Cannot be empty.");
		}

		if (balance < 0) {
			System.err.println("Balance cannot be negative.");
		} else {
			this.balance = balance;
		}
	}

	public void calculateInterest() {
		System.out.println("Interest calculation depends on account type.");
	}

	public void displayAccountDetails() {
		System.out.println("------ Account Details ------\n");
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance Rs: " + balance);
		System.out.println("IFSC CODE: " + IFSC_CODE);
	}
}
