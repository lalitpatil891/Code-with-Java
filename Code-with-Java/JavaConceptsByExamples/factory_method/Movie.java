package com.nit.factory_method;

public class Movie {
	
	private String movieName;
	private String actor;
	
	Movie(String movieName, String actor){
		this.movieName = movieName;
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", actor=" + actor + "]";
	}
	
	public static Movie getMovieObject() { //Factory method
		
		return new Movie("Jawan", "Shahrukh Khan"); 		
	}
}
