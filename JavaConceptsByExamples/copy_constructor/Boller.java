package com.nit.copy_constructor;

public class Boller {
	
	private int bollerId;
	private String bollerName;
	
	public Boller(Batter pl) {
		this.bollerId  = pl.getPlayerId();
		this.bollerName = pl.getPlayerName();
	}
	
	@Override
	public String toString() {
		return "Boller [ BollerId: "+bollerId+" , BollerName: "+bollerName+ " ]";
	}
}
