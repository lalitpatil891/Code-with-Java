package com.nit.student_id_card_management_system;

class IDCard {
	
	public String cardNumber;
    public String issueDate;
    public static final String instituteName;
    
    // Static initializer block to set the institute name
    static {
    	instituteName = "Global Institute of Technology";
    }
    
    //Constructor
	public IDCard(String cardNumber, String issueDate) {
		super();
		this.cardNumber = cardNumber;
		this.issueDate = issueDate;
		
	}
	
    void displayDetails(){
        System.out.println("ID Card Number: "+instituteName);
        System.out.println("ID Card NUmber: "+cardNumber);
        System.out.println("Issue Date: "+issueDate );
    }
    
}

