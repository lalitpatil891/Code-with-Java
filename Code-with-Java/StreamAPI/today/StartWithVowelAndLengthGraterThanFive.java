package com.nit.today;

import java.util.List;

public class StartWithVowelAndLengthGraterThanFive {

	public static void main(String[] args) {

        List<String> listInput = List.of("Aeroplane", "apple", "egg", "Dog", "Orange");
        
        List<String> newList = listInput.stream().filter(x -> x.length() > 5).toList();
        
        System.out.println(newList);
        
	}

}
