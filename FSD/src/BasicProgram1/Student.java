package BasicProgram1;


public class Student {
	
	int regNumber;
	String studentName;
	
	Student(int reg_no, String name){
		this.regNumber =reg_no;
		this.studentName = name;
	}
	
	public class StudentMain {
		
	}
	public static void main(String[] args) {
		
		Student[] arr;
		arr = new Student[5];
		
		arr[0] = new Student(12341, "Tommy");
		arr[1] = new Student(32456, "Musa");
		arr[3] = new Student(10263, "Joe");
		arr[4] = new Student(67589, "Richard");
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Student with Registration Number" +
					arr[i].regNumber + " is: " + arr[i].studentName);
		}
		

	}

}
