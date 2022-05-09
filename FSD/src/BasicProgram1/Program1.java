package BasicProgram1;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		
		int num1, num2; // the input of num1 and num2
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 =sc.nextInt();
		
		System.out.println("Arithmetic operations on the wo numbers are: ");
		
		System.out.println("Addition of the numbers is: " +(num1 + num2));
		System.out.println("Subtraction of the numbers is: " +(num1 - num2));
		System.out.println("Multiplication of the numbers is: " +(num1 * num2));
		System.out.println("Division of the numbers is: " +(num1 / num2));
		System.out.println("Modulo of the numbers is: " +(num1 % num2));
		

	}

}
