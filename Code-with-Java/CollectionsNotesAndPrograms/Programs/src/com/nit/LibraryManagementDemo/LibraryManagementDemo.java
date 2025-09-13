package com.nit.LibraryManagementDemo;

import java.util.ArrayList;
import java.util.List;

//1. Abstraction(interface)
interface Borrowable {
	void borrow(String user);
	void returnBook(String user);
}

//2. Encapsulation (private fields + getters/setter)
class Book implements Borrowable {
	private String title;
	private String author;
	private boolean isAvailable = true;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//Getter
	public String getTitle() {
		return title;
	}
	
	//Polymorphism: method overriding (from interface)
	@Override
	public void borrow(String user) {
		if(isAvailable) {
			isAvailable = false;
			System.out.println(user + " borrowed: "+title);
		}
		else
		{
			System.out.println(title +" is not available!");
		}	
	}
	
	
	@Override
	public void returnBook(String user) {
		isAvailable = true;
		System.out.println(user +" returned: "+title);
	}
	
	@Override
	public String toString() {
		return title +" by "+author +(isAvailable ? "(Available)": "(Borrowed)");
	}
}

//3. Inheritance + Polymorphism
class EBook extends Book {
		
	private double fileSizeMB;
	
	public EBook(String title, String author, double fileSizeMB) {
		super(title, author);
		this.fileSizeMB = fileSizeMB;
	}
	
	@Override
	public String toString() {
		return super.toString() +" [E-Book, " + fileSizeMB + "MB]";
	}
}

//4. Custom Exception 
class BookNotFoundException extends Exception {
	public BookNotFoundException(String message) {
		super(message);
	}
}


// 5. Multithreading (simulate notificaiton)
class NotificationThread extends Thread {
	private String message;
	
	public NotificationThread(String message) {
		this.message = message;
	}
	
	public void run() {
		System.out.println("Notification: "+message);
	}
}


//6. Main Library class
class Library {
	private List<Book> books = new ArrayList<>();
	
	//Generics used with List
	public void addBook(Book book) {
		books.add(book);
	}
	
	public Book findBook(String title) throws BookNotFoundException {
		return books.stream()
		        .filter(b -> b.getTitle().equalsIgnoreCase(title))
		        .findFirst()
		        .orElseThrow(() -> new BookNotFoundException("Book not found: " + title));
	}
	
	public void showAllBooks() {
		books.forEach(System.out::println);
	}
}

public class LibraryManagementDemo {

	public static void main(String[] args) {
		
		Library library = new Library();
		
		//Add Books
		library.addBook(new Book("Java Basics", "James Gosling"));
		library.addBook(new EBook("Advanced java", "Herbert Schildt",5.2));
		
		//show Books
		library.showAllBooks();
		
		try {
			//Borrow a book
			Book b1 = library.findBook("Java Basics");
			b1.borrow("Alice");
			
			//Borrow  again to show availability handling
			b1.borrow("Bob");
			
			//Return book
			b1.returnBook("Alice");
			
			//Notification in separate thread
			NotificationThread t1 = new NotificationThread("New Book 'Spring Boot' added!");
			t1.start();
			
			//Borrow Ebook
			Book b2 = library.findBook("Advanced Java");
			b2.borrow("Charlie");
		}
		catch(BookNotFoundException e) {
			System.out.println("Error: "+e.getMessage());
		}
		

	}

}
