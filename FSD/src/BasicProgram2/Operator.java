package BasicProgram2;

public class Operator {

	public static void main(String[] args) {
		
		int m1 = 10;
		int m2 = 5;
		int m3 =20;
		int min;
		
		min = (m1 < m3) ? m1 : m3;
		m3 += 4;
		m2 -= 4;
		
		
		System.out.println(m1 < m2 && m1++ <m3); //logical/Relational Operator (T/F)
		System.out.println(m1);
		System.out.println(m1 < m2 & m1++ <m3);
		System.out.println(m1);
		System.out.println(m3 != m2);
		System.out.println(m1 < m3);
		System.out.println(m3 > m2);
		System.out.println(m1 <= m3);
		System.out.println(m1 >= m3);
		
		System.out.println(m3 << 2); 
		System.out.println(m1 >> 2); 
		System.out.println(m2 >>> 2); 
		System.out.println(-m3 >> 2); 
		System.out.println(-m1 >>> 2); 
		
		System.out.println(min); //ternary Operator 
		
		System.out.println(m3); //assignment operator 
		System.out.println(m2);
		
		
	}
	

}
