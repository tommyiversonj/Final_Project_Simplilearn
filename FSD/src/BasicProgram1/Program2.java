package BasicProgram1;

import java.util.*;

public class Program2 {

	public static void main(String[] args) {
		
		//Factorial program example
		//3! = 1 * 2 * 3 = 6
		//5! = 1 * 2 * 3 * 4 * 5 = 120
		
		//Declaring variables here
		int n;
		int fact_var = 1;
		
		//Creating scanner object here
		Scanner tc = new Scanner(System.in);
		
		//Reading input from the user
		System.out.println("Enter a number");
		n = tc.nextInt();
		
		//Calculating factorial
		for (int i = 1; i <= n; i++) {
			fact_var = fact_var * i;
		}
	
		System.out.println("Factorial of the number "+n+"  is: "+fact_var);
	

	}

}
