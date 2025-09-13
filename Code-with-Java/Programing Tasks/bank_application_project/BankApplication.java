package com.nit.bank_application_project;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Select the Account Type:");
		System.out.println("1. Saving Account");
		System.out.println("2. Current Account");
		System.out.println("3. Fixed Deposit Account");
		System.out.println("----------------------------------");
		System.out.print("Please Enter The type account you want to open [1/2/3] :");
		int type = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		switch (type) {
		case 1:
			System.out.println("------ Enter Savings Account Details ------");
			System.out.print("Enter account Holder Name: ");
			String name = scanner.nextLine();
			System.out.print("Enter account number: ");
			String number = scanner.nextLine();
			System.out.print("Enter the Amount: ");
			double amount = scanner.nextDouble();
			System.out.println("-------------------------------------\n");

			SavingsAccount savingsAccount = new SavingsAccount(name, number, amount);
			savingsAccount.displayAccountDetails();
			savingsAccount.calculateInterest();

			break;

		case 2:
			System.out.println("------ Enter Current Account Details ------");
			System.out.print("Enter account Holder Name: ");
			String nameC = scanner.nextLine();
			System.out.print("Enter account number: ");
			String numberC = scanner.nextLine();
			System.out.print("Enter the Amount: ");
			double amountC = scanner.nextDouble();
			System.out.println("-------------------------------------\n");

			CurrentAccount currentAccount = new CurrentAccount(nameC, numberC, amountC);
			currentAccount.displayAccountDetails();
			currentAccount.calculateInterest();
			currentAccount.checkOverdraftLimit();
			break;

		case 3:
			System.out.println("------ Enter Fixed-Deposit Account Details ------");
			System.out.print("Enter account Holder Name: ");
			String nameD = scanner.nextLine();
			System.out.print("Enter account number: ");
			String numberD = scanner.nextLine();
			System.out.print("Enter the Amount: ");
			double amountD = scanner.nextDouble();
			System.out.print("Enter the deposit term [For How many years you want to deposit] : ");
			int term = scanner.nextInt();
			System.out.println("-------------------------------------\n");
			

			FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(nameD, numberD, amountD, term);
			fixedDepositAccount.displayAccountDetails();
			fixedDepositAccount.calculateInterest();
			break;

		default:
			System.out.println("Invalid choice. Please select 1, 2, or 3.");
		}
		
		scanner.close();
	}

}
