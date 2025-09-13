//package com.nit.flat_map;

import java.util.ArrayList;

// Record to represent a Player with id, name, and experience
record Player(Integer id, String name, Integer experience) {
}

public class
 {

	public static void main(String[] args) {

		// Creating a list to store Player objects
		ArrayList<Player> listOfPlayer = new ArrayList<>();

		// Adding Player objects to the list
		listOfPlayer.add(new Player(1, "Rohit", 5));
		listOfPlayer.add(new Player(2, "Virat", 6));
		listOfPlayer.add(new Player(3, "Gill", 3));
		listOfPlayer.add(new Player(4, "Shami", 4));
		listOfPlayer.add(new Player(5, "Rahul", 5));

		// Finding the total experience of all players using mapToInt and sum
		int sum = listOfPlayer.stream()
				.mapToInt(Player::experience) // Extracting experience from each player
				.sum(); // Summing up the experiences

		// Printing the total experience
		System.out.println("Total Experience is: " + sum); // Output: Total Experience is: 23
	}
}
