package com.nit.student_id_card_management_system;

class Student {
	String name;
    int age;
    IDCard idCard;
    
    public Student(String name, int age) {
    	this.name = name;
    	this.age = age;

    }

    public void assignIDCard(IDCard idCard)
    {
    	this.idCard = idCard;
    } 

    void displayDetails()
    {
    	System.out.println("Creating ID Card...");
        System.out.println("Student Name: "+name);
        System.out.println("Age: "+age);
        
        if(idCard != null) {
        	System.out.println("ID Card Details: ");
        	idCard.displayDetails();
        }
        else
        {
        	System.out.println("No ID Card assigned.");
        }
        
       
    }
}
