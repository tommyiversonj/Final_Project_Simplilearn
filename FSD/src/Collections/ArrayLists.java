package Collections;

import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {
		
		//creating Arraylist
		//Array list behaves according to the dynamic array DS way
		
		System.out.println("ArrayList Mixed Data\n");
		ArrayList<Comparable> al = new ArrayList<Comparable>();//Indicate the collection to have only string data
		al.add(10);
		al.add("Sachin");
		al.add('S');
		al.add(1909.87f);
		al.add(123456.789);
		System.out.println(al);
		
		System.out.println("ArrayList for Specific Data\n");
		ArrayList<String> city = new ArrayList<String>();
		city.add("Harper");
		city.add("Pleebo");
		
		System.out.println(city);
		

	}

}
