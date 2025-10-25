import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class ComparingHashMapAndLinkedHashMap {

	public static void main(String[] args) {

		
		compareIterationOrder();
		
	}

	private static void compareIterationOrder() {


		HashMap<Integer, String> list1 = new HashMap<>();
		LinkedHashMap<Integer, String> list2 = new LinkedHashMap<>();

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter key "+i+" : " );
			int number = sc.nextInt();
			
			System.out.println("Enter Value"+i+ " : ");
			String strName = sc.next();
		
		list2.put(number, strName);
		list1.put(number, strName);
		
		}
		
		System.out.println("HashMap: "+list1);
		System.out.println("LinkedHashMap: "+list2);
		
	}
	
	
}
