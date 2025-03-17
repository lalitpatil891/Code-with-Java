package com.nit.exam_21_dec_gaming_tournament_system;

public class Tester {

	public static void main(String[] args) {
		// Single-Player Game Instances
        SinglePlayerGame spGame1 = new SinglePlayerGame("Solo Adventure", 500, 20);
        SinglePlayerGame spGame2 = new SinglePlayerGame("Solo Adventure", 500, 20);

        // Multiplayer Game Instances
        MultiplayerGame mpGame1 = new MultiplayerGame("Team Battle Royale", 300, 5, 15);
        MultiplayerGame mpGame2 = new MultiplayerGame("Team Battle Royale", 300, 5, 15);

        // Tournament System
        TournamentSystem tournamentSystem = new TournamentSystem();

        // Register Games
        tournamentSystem.registerGame(spGame1, 1); // Valid single-player registration
        tournamentSystem.registerGame(spGame2, 2); // Invalid single-player registration
        tournamentSystem.registerGame(mpGame1, 3); // Valid multiplayer registration
        tournamentSystem.registerGame(mpGame2, 6); // Invalid multiplayer registration

	}

}
