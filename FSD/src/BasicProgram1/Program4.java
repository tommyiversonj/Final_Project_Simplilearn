package BasicProgram1;

class Dog{
	//properties of the dog
	String name;
	String color; 
	int cost;
	String bread;
	int age;
	
	//behaviors of the dog
	void eat() {
		System.out.println("Dog eats");
	}
	
	void run() {
		System.out.println("Dog runs");
	}
	
	void bark() {
		System.out.println("Dog barks");
	}
}

public class Program4 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.name = "Teddy";
		d.color = "Gold";  
		d.cost = 3000;
		d.age = 2;
		d.bread = "GR";
		
		System.out.println("Name of the dog is: " +d.name);  
		System.out.println("Color of the dog is: " +d.color);
		System.out.println("Cost of the dog is: " +d.cost);
		System.out.println("Age of the dog is: " +d.age);
		System.out.println("Bread of the dog is: " +d.bread);
		
		d.eat();  
		d.run();
		d.bark();
		

	}

}
