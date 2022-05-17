package Methods;

public class Method1 {
	
	public int multiplynumbers(int a, int b){
		int z = a * b;
		return z;
	}

	public static void main(String[] args) {
		Method1 b = new Method1();
		int ans = b.multiplynumbers(10, 3);
		System.out.println("Multiplication is :"+ans);

	}

}
