package HashMap;

import java.util.HashMap;

record Manager(Integer id, String managerName)
{
	
}

public class HashMapInternalDemo2 {

	public static void main(String[] args) 
	{
		Manager m1 = new Manager(111,"Alen");
		Manager m2 = new Manager(111,"Alen");
		
		
		System.out.println(m1.hashCode());	//2046885
		System.out.println(m2.hashCode());	//2046885
		
		
		HashMap<Manager,String> map = new HashMap<>();
		map.put(m1, "Ameerpet");
		map.put(m2, "S R Nagar");
		
		System.out.println(map.size()); // 1
		
		System.out.println(map);   //{Manager[id=111, managerName=Alen]=S R Nagar}
	}
}
