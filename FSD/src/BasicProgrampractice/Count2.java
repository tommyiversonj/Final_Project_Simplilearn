package BasicProgrampractice;

public class Count2 {

	public static void main(String[] args) {
		
		int count = 25;
		
		for (int x=1; x<=5; x++) {
			for(int j=1; j<=5; j++) {
				if (count<10) {
					
					System.out.print("0");
					System.out.print(count);
					System.out.print(" ");
					count--;
					
				}
				else {
					System.out.print(count);
					System.out.print(" ");
					count--;
				}
				
			}
			System.out.println();		
		
	}

}
	
}
