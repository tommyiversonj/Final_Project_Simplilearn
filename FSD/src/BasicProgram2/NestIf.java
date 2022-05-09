package BasicProgram2;

import java.util.*;

public class NestIf {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int age = 0;
	int weight = 0;
	
	System.out.println("Enter the Age :");
	age = sc.nextInt();
	System.out.println("Enter Weight to check for eligibilty :");
	weight = sc.nextInt();
	
	if (age >= 18) {
		if(weight > 50) {
			System.out.println("You have passed the eligibilty test and you are eligible to donate blood");
		}
	} else {
		System.out.println("Not Allow");
	}
}
	
}

