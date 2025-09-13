package com.nit.assignment_09_jan_mcq;

import java.io.StreamCorruptedException;

public class a86 
{
  public static void main(String[] argv) 
  {
    try 
	{

      throw new MalformedURLException("bad url");
      throw new StreamCorruptedException("bad file");
      throw new Exception("bad");
      System.out.println("Success");
    } 
	catch (MalformedURLException e) 
	{
      System.out.println("Bad URL");
    } 
	catch (StreamCorruptedException e) 
	{
      System.out.println("Bad file contents");
    } 
	catch (Exception e) 
	{
      System.out.println("General exception");
    } 
	finally {
      System.out.println("Doing finally part");
    }
    System.out.println("Carrying on");
  }
}
