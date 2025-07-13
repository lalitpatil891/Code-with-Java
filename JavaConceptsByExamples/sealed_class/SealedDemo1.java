package com.nit.sealed_class;

sealed class Bird permits Parrot, Sparrow
{
	public void roam() {
		System.out.println("Generic Bird is roaming");
	}
}

non-sealed class Parrot extends Bird 
{
	@Override
	public void roam()
	{
		System.out.println("Parrot Bird is roaming");
	}
}

final class Sparrow extends Bird
{
	@Override
	public void roam()
	{
		System.out.println("Sparrow Bird is roaming");
	}
}

public class SealedDemo1 {

	public static void main(String[] args) {
		
		Bird b = null;
		
		b = new Parrot();
		b.roam();  //Dyanamic Method Dispatch
		
		b = new Sparrow();
		b.roam();  //Dyanamic Method Dispatch
	}

}
