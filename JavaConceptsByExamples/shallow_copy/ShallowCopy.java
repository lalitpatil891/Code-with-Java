package com.nit.shallow_copy;

public class ShallowCopy {

	public static void main(String[] args) {
		
		Laptop lap1 = new Laptop("HP", 86000);
		Laptop lap2 = lap1;

		System.out.println("Before Change...");
		
		System.out.println(lap1);
		System.out.println(lap2);
		
		System.out.println("After Change...");
		lap2.setLaptopBrand("Dell");
		lap2.setLaptopPrice(90000);
		System.out.println(lap1);
		System.out.println(lap2);
	}
}

/*
Before Change...
Laptop [ laptopBrand= HP, laptopPice= 86000.0]
Laptop [ laptopBrand= HP, laptopPice= 86000.0]
After Change...
Laptop [ laptopBrand= Dell, laptopPice= 90000.0]
Laptop [ laptopBrand= Dell, laptopPice= 90000.0]
*/
