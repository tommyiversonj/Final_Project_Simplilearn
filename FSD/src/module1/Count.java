package module1;

public class Count {

	public static void main(String[] args) {
		
		int count = 1;
		
		for (int x=1; x<=5; x++) {
			for(int j=1; j<=5; j++) {
				System.out.print(count);
				System.out.print(" ");
				count++;
			}
			
			System.out.println();
		}

	}

}
