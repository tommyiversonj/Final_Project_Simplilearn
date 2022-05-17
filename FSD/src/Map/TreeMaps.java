package Map;

import java.util.Map;
import java.util.*;

public class TreeMaps {

	public static void main(String[] args) {
	
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(3, "Ales");
		map.put(10, "Weah");
		map.put(4, "Alex");
		map.put(6, "Blessing");
		
		System.out.println("\nThe Elements of HashTable are");
		for(Map.Entry l:map.entrySet()) {
			System.out.println(l.getKey()+" "+l.getValue());
		
		
		}

	}

}
