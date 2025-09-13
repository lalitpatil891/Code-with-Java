package com.nit.copy_constructor;

public class Batter {
	
	private int playerId;
	private String playerName;
	
	public Batter(int playerId, String playerName) {
		this.playerId = playerId;
		this.playerName = playerName;
	}
	
	public int getPlayerId() {
		return playerId;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	@Override
	public String toString() {
		return "Batman [ PlayerId: "+playerId+" , PlayerName: "+playerName+" ]";
	}
}
