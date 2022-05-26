package InnerClasses;

abstract class AnonymousInnerClass{
	public abstract void display();
}

public class InnerClassAnonymous {

	public static void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {
			
			@Override
			public void display() {
				System.out.println("Anonymous Innner Class");
				
			}
		
		};
		i.display();
}
}