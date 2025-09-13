package com.nit.variable_shadowing;

public class Example7 {

	int math;
	int phy;
	int chem;

	public Example7(int math, int phy, int chem) {
		super();
		this.math = math;
		this.phy = phy;
		this.chem = chem;
	}

	public void calculateAvg() {

		System.out.println("math= " + this.math + ", phy= " + this.phy + ", chem= " + this.chem);
		int sum = this.chem +this.math + this.phy;
		int avg = sum/3;
		System.out.println("Sum= "+sum);
		System.out.println("Avg= "+avg);		
		
	}

	public static void main(String[] args) {

		Example7 s1 = new Example7(70, 80, 90);
		s1.calculateAvg();

		System.out.println("-------------------------------");
		
		Example7 s2 = new Example7(50, 50, 50);
		s2.calculateAvg();

	}

}
