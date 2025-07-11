package com.nit.exception_handling;

import java.io.Closeable;
import java.io.IOException;

class FileResourse implements Closeable
{
	@Override
	public void close() throws IOException 
	{
		System.out.println("File Resourse Closed!!!");
		
	}

}


class DatabaseResourse implements AutoCloseable
{
	@Override
	public void close() throws Exception 
	{
		System.out.println("Database Resourse Closed!!!");
		
	}

}

public class TryWithResourseDemo {

	public static void main(String[] args) throws Exception
	{
		System.out.println("Main Started");
		
		FileResourse fr = new FileResourse();
		DatabaseResourse dr = new DatabaseResourse();
		
		try(fr ; dr)
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.err.println("Divide by zero problem");
		}
		
		System.out.println("Main Ended");

	}

}
