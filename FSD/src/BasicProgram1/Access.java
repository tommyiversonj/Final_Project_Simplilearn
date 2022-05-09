package BasicProgram1;

class DefAccessSpecifier{ //Default: Available only within same package
	 void display() { 

		System.out.println("You are using default access specifier");
	}
}

class PrivateAccessSpecifier{ //private: Only within the class
	private void display() {
		
		System.out.println("You are using private access specifier");
	}
}
	class ProtectedAccessSpecifier{ //Protected: available within same package and also inheritance class
		protected void display() {
			
			System.out.println("You are using Protected access specifier");
	}
}	
	class PublicAcessSpecifier{
	public void display() {
		System.out.println("You are using Public access specifier");
	}

}

public class Access {
	
	public static void main(String[] args) {
		System.out.println("Default Access Specifier");
		DefAccessSpecifier obj = new DefAccessSpecifier();
		obj.display();
		
	//System.out.println("Private Access Specifier");
		//PrivateAccessSpecifier obj1 = new PrivateAccessSpecifier();
		//obj1.display();

		System.out.println("Protected Access Specifier");
		ProtectedAccessSpecifier obj2 = new ProtectedAccessSpecifier();
		obj2.display();
		
		System.out.println("Public Access Specifier");
		PublicAcessSpecifier obj3 = new PublicAcessSpecifier();
		obj3.display();
		
	}

}
