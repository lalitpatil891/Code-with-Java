package com.nit.payroll_system;

import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {

		Employee e = new Employee(02, "Lalit Patil", 30000, 5000, 2000);

		Sourcing s = new Sourcing(1, "John Doe", 50000, 20, 10, 5, 1000, 50, 45, 200);

		Trainer t = new Trainer(1, "Alice Smith", 55000, 15, 12, 6, 500);

		Manager m = new Manager(1, "Robert Brown", 75000, 20, 15, 10000);

		TaxUtil tax = new TaxUtil();
		
		DecimalFormat df = new DecimalFormat("####.##");
		
		System.out.println(e.toString());
		System.out.println("Employee Total Tax: " + df.format(tax.calculateTax(e)));
		System.out.println("-------------------------------------");
		
		System.out.println(m.toString());
		System.out.println("Manager Total Tax: " + df.format(tax.calculateTax(m)));
		
		System.out.println("-------------------------------------");
		
		System.out.println(s.toString());
		System.out.println("Source Total Tax: " + df.format(tax.calculateTax(s)));
		
		System.out.println("-------------------------------------");
		
		System.out.println(t.toString());
		System.out.println("Trainer Total Tax: " + df.format(tax.calculateTax(t)));
	}
}
