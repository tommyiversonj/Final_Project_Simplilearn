package Methods;

public class CallMethod1 {

		static int vals=150; //instance variable, not static
		
		int operation(int val) { //Local variable
			this.vals = val * 10 /100;
			return(vals);
		}

		public static void main(String[] args) {
			CallMethod1 d = new CallMethod1();
			System.out.println("Before operation value of the data: " +d.vals); //150
			d.operation(100);
			System.out.println("After operation value of the data: " +d.vals);

		}

	}




