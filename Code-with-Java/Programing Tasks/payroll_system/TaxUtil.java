package com.nit.payroll_system;

public class TaxUtil {

	public double calculateTax(Employee e)
	{
		double grossSalWithTax;
		if(e.calculateGrossSalary() >= 50000)
		{
			grossSalWithTax = e.calculateGrossSalary()*0.20;
			return grossSalWithTax;
			
			//return e.calculateGrossSalary()*0.20;
		}
		else
		{
			grossSalWithTax = e.calculateGrossSalary()*0.05;
			return grossSalWithTax;
		}
		
	}
	
	public double calculateTax(Manager m)
	{
		double grossSalWithTax;
		if(m.calculateGrossSalary() >= 50000)
		{
			grossSalWithTax = m.calculateGrossSalary()*0.20;
			return grossSalWithTax;
		}
		else
		{
			grossSalWithTax = m.calculateGrossSalary()*0.05;
			return grossSalWithTax;
		}
	}
	
	public double calculateTax(Trainer t)
	{
		double grossSalWithTax;
		if(t.calculateGrossSalary() >= 50000)
		{
			grossSalWithTax = t.calculateGrossSalary()*0.20;
			return grossSalWithTax;
		}
		else
		{
			grossSalWithTax = t.calculateGrossSalary()*0.05;
			return grossSalWithTax;
		}
	}
	
	public double calculateTax(Sourcing s)
	{
		double grossSalWithTax;
		if(s.calculateGrossSalary() >= 50000)
		{
			grossSalWithTax = s.calculateGrossSalary()*0.20;
			return grossSalWithTax;
		}
		else
		{
			grossSalWithTax = s.calculateGrossSalary()*0.05;
			return grossSalWithTax;
		}
	}

}
