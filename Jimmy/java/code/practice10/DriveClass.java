package practice10;

public class DriveClass {

	public static void main(String[] args) {

		Student s1 = new Student(111, "mohit goel");
		Student s2 = new Student(s1);

		s1.getStudnetInfo();
		s2.getStudnetInfo();
	}
}