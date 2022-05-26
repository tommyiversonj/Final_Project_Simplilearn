package InnerClasses;


public class InnerClass1 {
	
	private String msg = "Welcome to Java";
	
	class Inner1{
		void hello() {
			System.out.println(msg+", Lte us start learning Inner Classes");
		}
	}

	public static void main(String[] args) {
		
		InnerClass1 obj = new InnerClass1();
		InnerClass1.Inner1 in = obj.new Inner1();
		in.hello();
		
		

	}

}
