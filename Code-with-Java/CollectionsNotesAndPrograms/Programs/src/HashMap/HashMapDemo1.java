package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo1 
{
	public static void main(String[] args) 
	{      
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Vanilla"); 
        map.put(2, "Butterscotch");
        map.put(3, "Chocolate");
        map.put(4, "Cotton Candy");

        System.out.println("HashMap: " + map); //{key = value}
    
       
        String value = map.get(2);
        
        System.out.println("Value for key 2: " + value);
        
        value = map.getOrDefault(3, "Key is not available");
        System.out.println("Value for key 3: " + value);
        
       
        boolean hasKey = map.containsKey(3);
        System.out.println("HashMap contains key 3: " + hasKey);

        boolean hasValue = map.containsValue("Vanilla");
        System.out.println("HashMap contains value 'Vanilla': " + hasValue);
       
        
        
        map.remove(1);
        System.out.println("HashMap after removing key 1: " + map);

       
        System.out.println("Iterating through HashMap:");
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) 
        {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

       
        System.out.println("Iterating through Iterator");
        
        Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
        itr.forEachRemaining(System.out::println);
      
     
        System.out.println("Iterating through forEach(BiConsumer<T,U>)");
        map.forEach((k,v)-> System.out.println("Key is :"+k+" Value is :"+v));
        
             
        int size = map.size();
        System.out.println("Size of HashMap: " + size);
       
        map.clear();
        System.out.println("HashMap after clearing: " + map); //{}        
       
    }
}

/*HashMap: {1=Vanilla, 2=Butterscotch, 3=Chocolate, 4=Cotton Candy}
Value for key 2: Butterscotch
Value for key 3: Chocolate
HashMap contains key 3: true
HashMap contains value 'Vanilla': true
HashMap after removing key 1: {2=Butterscotch, 3=Chocolate, 4=Cotton Candy}
Iterating through HashMap:
Key: 2, Value: Butterscotch
Key: 3, Value: Chocolate
Key: 4, Value: Cotton Candy
Iterating through Iterator
2=Butterscotch
3=Chocolate
4=Cotton Candy
Iterating through forEach(BiConsumer<T,U>)
Key is :2 Value is :Butterscotch
Key is :3 Value is :Chocolate
Key is :4 Value is :Cotton Candy
Size of HashMap: 3
HashMap after clearing: {}
*/
