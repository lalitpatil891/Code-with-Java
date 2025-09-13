package com.nit.exam_21_dec_gaming_tournament_system;

public class TournamentSystem {
	public void registerGame(SinglePlayerGame game, int players) {
		System.out.println("\nRegistering for Single-Player Game: " + game.gameName);
		game.displayDetails();
		double fee = game.calculateFee(players);
		if (fee != -1) {
			System.out.println("Total Fee for " + players + " player(s): ₹" + fee);
		}
	}

	public void registerGame(MultiplayerGame game, int players) {
		System.out.println("\nRegistering for Multiplayer Game: " + game.gameName);
		game.displayDetails();
		double fee = game.calculateFee(players);
		if (fee != -1) {
			System.out.println("Total Fee for " + players + " player(s): ₹" + fee);
		}
	}

}
