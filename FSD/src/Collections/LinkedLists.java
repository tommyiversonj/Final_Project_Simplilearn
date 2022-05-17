package Collections;

import java.util.*;

public class LinkedLists {

	public static void main(String[] args) {
		System.out.println("LinkedList\n");
		LinkedList<String> names = new LinkedList<String>();
		names.add("Alex");
		names.add("John");
		
		Iterator<String> itr = names.iterator();// Iterator is a cursor that points to an object as the java doesn't support pointers
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
