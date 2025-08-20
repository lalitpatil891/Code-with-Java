package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		System.out.println(num);	//[10, 20, 30, 40, 50]
		
		num.add(2, 90);
		System.out.println(num);	//[10, 20, 90, 30, 40, 50]
		
		num.add(80);
		System.out.println(num);	//[10, 20, 90, 30, 40, 50, 80]
		
		num.remove(1);
		System.out.println(num);	//[10, 90, 30, 40, 50, 80]
		
		num.addFirst(20);
		System.out.println(num);	//[20, 10, 90, 30, 40, 50, 80]
		
		num.addLast(60);
		System.out.println(num);    //[20, 10, 90, 30, 40, 50, 80, 60]
		

		System.out.println(num.getFirst());  //20
		System.out.println(num.getLast());	//60
		System.out.println(num.isEmpty()); 	//false
		System.out.println(num.removeIf((x) -> x == 20 ));  //true
	
		System.out.println(num); 			//[10, 90, 30, 40, 50, 80, 60]
	}
}
