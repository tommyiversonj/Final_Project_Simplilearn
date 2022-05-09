package BasicProgram2;

import java.util.*;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i;
		Scanner lc = new Scanner(System.in);
		System.out.println("Enter the no of values");
		i = lc.nextInt();
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
				

	}

}
