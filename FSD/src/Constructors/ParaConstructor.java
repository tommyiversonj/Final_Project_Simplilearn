package Constructors;

class Std{
	int id;
	String name;
	
	Std(int i, String n){
		

		id=1;
		name=n;
	}
	
	
	void display() {
		System.out.println(id+" "+name);
	}
	
}

public class ParaConstructor {
	public static void main(String[] arg) {
		Std std1 = new Std(2, "Alex");
		Std std2 = new Std(5, "Jasmine");
		Std std3 = new Std(2, "Tommy");
		std1.display();
		std2.display();
		std3.display();
		
		
	}

}
