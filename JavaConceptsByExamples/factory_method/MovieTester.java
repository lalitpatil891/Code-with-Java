package com.nit.factory_method;

public class MovieTester {

	public static void main(String[] args) {
		
		Movie m = Movie.getMovieObject(); //factory Method
		
		System.out.println(m);
	}

}
