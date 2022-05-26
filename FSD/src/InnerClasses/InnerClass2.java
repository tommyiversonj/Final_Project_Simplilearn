package InnerClasses;

public class InnerClass2 {
	
	private String msg = "Inner Classes";
	
	void display() {
		class Inner2{
			void msg() {
				System.out.println(msg);
			}
		}
		
		Inner2 l = new Inner2();
		l.msg();
	}

	public static void main(String[] args) {
		
		InnerClass2 ob = new InnerClass2();
		ob.display();

	}

}
