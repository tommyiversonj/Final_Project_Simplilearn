package BasicProgram2;

public class CastingNarrow {

	public static void main(String[] args) {
		
		double num1 = 9.78d;
		float num2 = (float) num1; // manuel casting double to int
		long num3 = (long) num1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

	}

}
