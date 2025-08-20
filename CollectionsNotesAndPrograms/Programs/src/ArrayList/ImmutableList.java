package ArrayList;

import java.util.Arrays;
import java.util.List;

public class ImmutableList {

	public static void main(String[] args) {

		List<Integer> immutable = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		// immutable.add(9); java.lang.UnsupportedOperationException
		// immutable.remove(0); java.lang.UnsupportedOperationException
		// immutable.set(0, 90); java.lang.UnsupportedOperationException
		System.out.println(immutable);

	}

}


/**2) Immutable List :
-------------------
List interface has provided a predefined static method called 
of(T ...x) available from java 9V.

It will create an immutable list, return type of this method is 
List<E>. Once it is created after that we can't pefrom any kind of operation like add(), remove() or replace [set(int index, Object obj)] otherwise we will get java.lang.UnsupportedOperationException

*/