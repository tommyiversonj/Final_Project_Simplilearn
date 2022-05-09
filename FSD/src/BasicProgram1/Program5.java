package BasicProgram1;

class NewStudent1{
	
	//properties
	String name;
	int id;
	int age;
	int clas;
	
	//Behavior 
	void section() {
		System.out.println("Student in section: 2");
	}
	
	void rollnum() {
		System.out.println("Student roll num is: 5");
	}
	
	void seatnum() {
		System.out.println("Student seat num is: 36");
	}
	
}

class NewStudent2{
	
	//properties
	String name;
	int id;
	int age;
	int clas;
	
	//Behavior 
	void section() {
		System.out.println("Student in section: 1");
	}
	
	void rollnum() {
		System.out.println("Student roll num is: 3");
	}
	
	void seatnum() {
		System.out.println("Student seat num is: 9");
	}
	
}

public class Program5 {

	public static void main(String[] args) {	
		NewStudent1 n = new NewStudent1();
		n.name = "Tommy Iverson Johnson";
		n.id = 12089;
		n.age = 17;
		n.clas = 12;
		
		System.out.println("The Student name is: " +n.name);
		System.out.println("The Student id no is: " +n.id);
		System.out.println("The Student age is: " +n.age);
		System.out.println("The Student Class is: " +n.clas);
		
		n.section();
		n.rollnum();
		n.seatnum();
		
		System.out.println("------------------------------------------");
		
		NewStudent2 t = new NewStudent2();
		t.name = "Eddie N. Nyepan";
		t.id = 31253;
		t.age = 15;
		t.clas = 10;
		
		System.out.println("The Student name is: " +t.name);
		System.out.println("The Student id no is: " +t.id);
		System.out.println("The Student age is: " +t.age);
		System.out.println("The Student Class is: " +t.clas);
		
		t.section();
		t.seatnum();
		t.rollnum();
		

	}

}
