package Map;

import java.util.*;

public class HashTables {

	public static void main(String[] args) {
		
	Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
	ht.put(10, "Ales");
	ht.put(12, "Weah");
	ht.put(4, "Alex");
	ht.put(106, "Blessing");
	
	System.out.println("\nThe Elements of HashTable are");
	for(Map.Entry n:ht.entrySet()) {
		System.out.println(n.getKey()+" "+n.getValue());
	
	
	}

}
}
