package com.nit.heap_and_stack_diagram;

public class Customer {
	
	private String name;
	private int id;
	
	public Customer(String name, int id)
	{
		super();
		this.name=name;
		this.id= id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public void setName(String name)
	{
		this.name =name;
	}
	
	public String getName() {
		return this.name;
	}
}
