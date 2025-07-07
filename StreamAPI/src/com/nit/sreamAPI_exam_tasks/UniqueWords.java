package com.nit.sreamAPI_exam_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueWords {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		List<String> sentences = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			sentences.add(scanner.nextLine().toLowerCase());
		}
		
		scanner.close();
		
		Set<String> uniqueWords = sentences.stream()
				.flatMap(sentence -> Arrays.stream(sentence.split(" ")))
				.collect(Collectors.toSet());
		
		System.out.println(uniqueWords);		
	}

}

/**
 * 
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        Set<String> uniqueWords = new HashSet<>();
        for (int i = 0; i < n; i++) {
            uniqueWords.addAll(Arrays.asList(scanner.nextLine().toLowerCase().split(" ")));
        }
        scanner.close();
        
        System.out.println(uniqueWords);
    }
}

*/
