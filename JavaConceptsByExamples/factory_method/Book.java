package com.nit.factory_method;

public class Book {
	
	private String authorName;
	private String bookTitle;
	
	public Book(String authorName, String bookTitle)
	{
		super();
		this.authorName = authorName;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return "Book [authorName=" + authorName + ", bookTitle=" + bookTitle + "]";
	}
	
	public static Book getBookObject()
	{
		return new Book("James Gosling","Java");
	}
}
