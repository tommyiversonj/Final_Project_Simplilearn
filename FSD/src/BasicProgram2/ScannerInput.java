package BasicProgram2;

import java.util.*;

public class ScannerInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your name is: ");
		String name = sc.nextLine();
		System.out.print("\nInput weight in kilogram: ");
	    double weight = sc.nextDouble();
	    System.out.print("\nInput height in meters: ");
	    double height = sc.nextDouble();
	    double BMI = weight / (height * height);
	    System.out.println("\nYour Name:" +name);
	    System.out.print("\nYour Body Mass Index (BMI) is " + BMI + " kg/m2");
	    
	    }
	   
		

	}


