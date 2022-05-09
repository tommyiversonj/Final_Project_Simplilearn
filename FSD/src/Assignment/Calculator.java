package Assignment;

import java.util.*;



public class Calculator {
	public static void main(String[] args) {
		Scanner tw = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = tw.nextInt();
		System.out.println("Enter num2");
		int num2 = tw.nextInt();
		
		System.out.println("Pleae select the operation to be perform\n"+"1. Addition\n"+"2. Subtraction\n" +"3. Multiplication\n" +"4. Division\n");
		int tot =tw.nextInt();
		
		if(tot==1) {
			int addition = num1+num2;
			System.out.println("The Addition result is:" +addition);
		}
		else if(tot==2) {
			int subtraction = num1-num2;
			System.out.println("The Subtraction result is:" +subtraction);
		}
		else if(tot==3) {
			int multiplication = num1*num2;
			System.out.println("The Subtraction result is:" +multiplication);
		}
		else if(tot==4) {
			int division = num1/num2;
			System.out.println("The Subtraction result is:" +division);
		}
	}

	
	}