package com.nit.sealed_class;

sealed class OnlineClass permits Laptop, Mobile
{
	public void attendJavaOnline()
	{
		System.out.println("Sunday online class at 9:30 AM");
	}
}

final class Laptop extends OnlineClass
{
	@Override
	public void attendJavaOnline()
	{
		System.out.println("Attending online class through Laptop");
	}
}

final class Mobile extends OnlineClass
{
	@Override
	public void attendJavaOnline()
	{
		System.out.println("Attending online class through Mobile");
	}
}

public class SealedDemo2 {
	public static void main(String[] args) {
		
		OnlineClass onlineClass = null;
		
		onlineClass = new Laptop();
		onlineClass.attendJavaOnline();
		
		onlineClass = new Mobile();
		onlineClass.attendJavaOnline();
	}

}
