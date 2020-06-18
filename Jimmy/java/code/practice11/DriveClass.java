package practice11;

public class DriveClass {

	public static void main(String[] args) {
		
		Student s1 = new Student(111, "mohit goel");
		
		Student s2 = new Student();
		
		s2.rollNo = s1.rollNo;
		s2.name = s1.name;
		
		s1.getStudentInfo();
		s2.getStudentInfo();
	}
}