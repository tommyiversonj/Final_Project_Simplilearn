package BasicProgram1;

public class Program6 {

	public static void main(String[] args) {
		
		System.out.println("Implicit Type Casting");
		
		char a = 'A'; // A ASCII is 65
		System.out.println("The Value of a: "+a);
		
		int b = a;
		System.out.println("The Value of a: "+b);
		
		float c = a;
		System.out.println("The Value of a: "+c);
		
		long d = a;
		System.out.println("The Value of a: "+d);
		
		double e = a;
		System.out.println("The Value of a: "+e);
		
		System.out.println("\n");

		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double x = 45.5;
		int y = (int)x;
		
		System.out.println("Value of x: "+x);
		System.out.println("Value of x: "+y);
		

		
		
	}

}
