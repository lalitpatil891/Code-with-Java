package com.nit.student_id_card_management_system;

class IDCardMaker {
	
	//Static Factory method to create an IDCard Object
	 public static IDCard wearIDCard(String cardNumber, String issueDate){

	        return new IDCard(cardNumber,issueDate);
	    }
	 
	 
}
