package Array;

import java.util.*;

public class SingleArray {

	public static void main(String[] args) {
		
		//Single-dimensional array using static approach, give data during declaration 
		int a[] = {10,20,30,40,50};
		for(int i=0; i<5; i++) {
			System.out.println("Elements of array a: "+a[i]);
		}
		//Single-dimensional array using dynamic approach, give data during declaration 
		System.out.println("Enter the array size");
		Scanner tc = new Scanner(System.in);
		int size = tc.nextInt();
		int a1[] = new int[size];
		
		for(int i = 0; i<a1.length; i++){
			System.out.println("Enter the element no:" +(i+1));
			a1[i] = tc.nextInt();
		}
		//Displaying the array elements 
		for(int i = 0; i<a1.length; i++){
			System.out.println("Enter the element no:" +(i+1)+ " is: "+a1[i]);
		
	}
		tc.close();
}
}
 