package practice09;

public class DriveClass {

	public static void main(String[] args) {

		Student s1 = new Student(111, "mohit");
		Student s2 = new Student(222, 80.22f);
		Student s3 = new Student(333, "goel", 77.34f);

		s1.getStudentInfo();
		s2.getStudentInfo();
		s3.getStudentInfo();
	}
}