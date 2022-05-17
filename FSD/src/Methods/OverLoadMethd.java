package Methods;

public class OverLoadMethd { // It means a method having same name, return type, same access modifier and parameters
							//but it must have the parameters in different order
	
	public void area (int b, int h) {
		System.out.println("Area of Traingle: " +(0.5*b*h));
	}
		public void area(float b, int h) {
			System.out.println("Area of Traingle: " +(3.14*b*h));
		}
		
		public void area(int h, float b) {
			System.out.println("Area of Traingle: " +(3.14*h*b));
		}
		
		public void area(int r) {
			System.out.println("Area of Traingle: " +(3.14*r*r));
		}
		
	public static void main(String[] args) {
	
			OverLoadMethd ob = new OverLoadMethd();
			ob.area(10,12);
			ob.area(0.8f, 130);
			ob.area(157);
				
		}

	}

