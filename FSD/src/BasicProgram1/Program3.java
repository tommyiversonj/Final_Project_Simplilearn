package BasicProgram1;

import java.util.*;

public class Program3 {

	public static void main(String[] args) {
		
		int v;
		Scanner vc = new Scanner(System.in);
		
		//Running infinite loop
		while (true) {
			System.out.println("Wo is the founder of Blue Origin");
			System.out.println("1. Bill Gates\n2. Tommy I. Johnson\n3. Nadella\n4. Jeff Bezos\n5. Exit Program");
			
			System.out.println("Enter your choice(1/2/3/4/5)");
			v = vc.nextInt();
			
			//validating user choices
			if ( v == 4) {
				System.out.println("Congratulations!! You have guessed the correct answer");
				break;
			}
			
			else if (v == 5){
				break;
			}
			else {
				System.out.println("Wrong choic. Please Try Again");
			}
		}

	}

}
