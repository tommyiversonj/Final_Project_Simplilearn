package String;

public class StringDemo {

	public static void main(String[] args) {
		
		//methods of string
		System.out.println("Methods of Strings");
		
		//length
		String sl = new String("Hello World");
		System.out.println(sl.length());
		
		//substring
		String sub = new String("Welcome");
		System.out.println(sub.substring(4));
		
		//String comparison
		String s1 = "Hello";
		String s2 = "Hello Dear";
		System.out.println(s1.compareTo(s1));
		
		//IsEmpty
		String s4 ="";
		System.out.println(s4.isEmpty());
		
		//String tolowerCse
		String s5 = "Hello";
		System.out.println(s1.toLowerCase());
		
		//replace
		String s6 = "Hello";
		String replace = s2.replace('d', 'l');
		System.out.println(replace);
		
		//equals
		String x = "Welcome to Java";
		String y = "Welcome to Java";
		System.out.println(x.equals(y));
		
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		
		//Creating StringBuffer and Append Method
		StringBuffer s = new StringBuffer("Welcome to Java ");
		s.append("Enjoy your Learning");
		System.out.println(s);
		
		//insert method
		s.insert(0, 'w');
		System.out.println(s);
		
		//replace method
		StringBuffer sb = new StringBuffer("Hello");
		sb.replace(0, 2, "hEL");
		System.out.println(sb);
		
		//delete method
		sb.delete(0, 1);
		System.out.println(sb);

		//Creating StringBuffer and Append Method
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1 = new StringBuilder("Happy");
		s.append("Learning");
		System.out.println(sb1);
		
		System.out.println(sb1.delete(0, 1));
		System.out.println(sb1.insert(1, "Welcome"));
		System.out.println(sb1.reverse());
		
		//Conversion
		System.out.println("\n");
		System.out.println("Coversion of Strings to Stringbuffer and StringBuilder");
		
		String str = "Hello";
		
		//conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println("String to StringBuffer");
		System.out.println(sbr);
		
		//conversion from String object to StringBuilder
		StringBuffer sbr5 = new StringBuffer(str);
		sbr5.append("World");
		System.out.println("String to StringBuilder");
		System.out.println(sbr5);
				
		
	}

}
















