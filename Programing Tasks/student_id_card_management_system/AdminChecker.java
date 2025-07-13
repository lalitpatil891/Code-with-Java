package com.nit.student_id_card_management_system;

public class AdminChecker {

	public static void main(String[] args) {
		
		IDCard idCard = IDCardMaker.wearIDCard("ID12345", "01-01-2023");
        Student student = new Student("Alice", 20);
        student.assignIDCard(idCard);
        student.displayDetails();
	}

}
