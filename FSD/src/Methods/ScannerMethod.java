package Methods;

import java.util.*;

public class ScannerMethod {
	
	String firsName;
	String midName;
	String lasName;
	int age;
	String gender;
	long telephon;
	String address;
	

	public static void main(String[] args) {
		Scanner sm = new Scanner(System.in);
		System.out.println("Please enter Employe Bio Data");
		System.out.println("-----------------------------\n");
		System.out.println("firsName");
		
		//String Input
		String firsName = sm.nextLine();
		System.out.println("midName");
		String midName = sm.nextLine();
		System.out.println("lasName");
		String lasName = sm.nextLine();
		System.out.println("age");
		String age = sm.nextLine();
		System.out.println("gender");
		String gender = sm.nextLine();
		System.out.println("telephon");
		String telephon = sm.nextLine();
		System.out.println("address");
		String address = sm.nextLine();
		
		System.out.println("\nEmployee First Name: " +firsName);
		System.out.println("\nEmployee Middle Name: " +midName);
		System.out.println("\nEmployee Last Name: " +lasName);
		System.out.println("\nEmployee Age: " +age);
		System.out.println("\nTelephon #: " +telephon);
		System.out.println("\nEmployee Address: " +lasName);
		

	}

}
