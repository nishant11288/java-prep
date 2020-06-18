package practice12;

public class DriveClass {

	public static void main(String[] args) {

		Student s1 = new Student(111,"mohit");
		Student s2 = new Student(222, "goel");
		
		s1.getStudentInfo();
		s2.getStudentInfo();
		
		Student.collegeName = "M M Modi";
		
		s1.getStudentInfo();
		s2.getStudentInfo();
		
		
	}

}
