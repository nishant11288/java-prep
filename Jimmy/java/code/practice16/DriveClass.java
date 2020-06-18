package practice16;

public class DriveClass {

	public static void main(String[] args) {
		
		
		Student s1  = new Student(111,"mohit");
		s1.getStudentInfo();
		
		Student.updateCollege();
		s1.getStudentInfo();
	}

}
