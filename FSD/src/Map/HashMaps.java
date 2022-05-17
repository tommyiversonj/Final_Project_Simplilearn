package Map;

import java.util.*;

public class HashMaps {

	public static void main(String[] args) {
		
		//Hashmap
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(1, "Tim");
		hm.put(2, "Mary");
		hm.put(5, "Jasmine");
		
		System.out.println("\nThe Elements of Hashmap are");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
	}

}
