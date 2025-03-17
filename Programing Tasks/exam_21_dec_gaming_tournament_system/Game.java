package com.nit.exam_21_dec_gaming_tournament_system;

abstract class Game {
    protected String gameName;
    protected double baseFee;

    public Game(String gameName, double baseFee) {
        this.gameName = gameName;
        this.baseFee = baseFee;
    }

    public abstract double calculateFee(int players);

    public void displayDetails() {
        System.out.println("Game Name: " + gameName);
        System.out.println("Base Fee: ₹" + baseFee);
    }
}

// Subclass: SinglePlayerGame
class SinglePlayerGame extends Game {
    private double soloBonusRate;

    public SinglePlayerGame(String gameName, double baseFee, double soloBonusRate) {
        super(gameName, baseFee);
        this.soloBonusRate = soloBonusRate;
    }

    @Override
    public double calculateFee(int players) {
        if (players != 1) {
            System.out.println("Error: Single-player games can only have one player.");
            return -1;
        }
        return baseFee + (baseFee * soloBonusRate / 100);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Solo Bonus Rate: " + soloBonusRate + "%");
    }
}

// Subclass: MultiplayerGame
class MultiplayerGame extends Game {
    private int maxPlayers;
    private double teamDiscountRate;

    public MultiplayerGame(String gameName, double baseFee, int maxPlayers, double teamDiscountRate) {
        super(gameName, baseFee);
        this.maxPlayers = maxPlayers;
        this.teamDiscountRate = teamDiscountRate;
    }

    @Override
    public double calculateFee(int players) {
        if (players > maxPlayers) {
            System.out.println("Error: Number of players exceeds the maximum allowed (" + maxPlayers + ").");
            return -1;
        }
        double totalFee = baseFee * players;
        if (players > 1) {
            totalFee -= totalFee * teamDiscountRate / 100;
        }
        return totalFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Max Players: " + maxPlayers);
        System.out.println("Team Discount Rate: " + teamDiscountRate + "%");
    }
}
