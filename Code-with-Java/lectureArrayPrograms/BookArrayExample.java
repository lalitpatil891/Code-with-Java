/**Q9) Create book object to access book class properties through book array index */

package logicalArray.lectureArrayPrograms;

class Book {
	String author;
	String title;
}

public class BookArrayExample {

	public static void main(String[] args) {

		Book []arrayBook = new Book[3];
		
		arrayBook[0] = new Book();
		arrayBook[1] = new Book();
		arrayBook[2] = new Book();
		
		arrayBook[0].author = "Sunil";
		arrayBook[1].author = "Darshan";
		arrayBook[2].author = "Mayur";
		
		arrayBook[0].title = "Java";
		arrayBook[1].title = "PHP";
		arrayBook[2].title = "Python";
		
		int index =0;
		
		while( index < arrayBook.length) {
			
			System.out.print(arrayBook[index].title);
			System.out.print(" by ");
			System.out.print(arrayBook[index].author);
			
			index++;
			System.out.println();
			
		}	
	}
}


/*OUTPUT

Java by Sunil
PHP by Darshan
Python by Mayur

*/