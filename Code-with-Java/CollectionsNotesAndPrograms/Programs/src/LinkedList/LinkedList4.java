package LinkedList;
import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String args[]) {
    	LinkedList<String> list = new LinkedList<>();
    	
    	list.addFirst("ravi");
    	list.add("Rahul");
    	list.addLast("Anand");
    	
    	System.out.println(list.getFirst());  	//ravi
    	System.out.println(list.getLast());		//Anand
    	
    	list.removeFirst();
    	list.removeLast();
    	
    	System.out.println(list);		//[Rahul]
    }
}
