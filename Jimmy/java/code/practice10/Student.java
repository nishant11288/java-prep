package practice10;

public class Student {

	int rollNo;
	String name;

	Student(int r, String n) {
		rollNo = r;
		name = n;
	}

	Student(Student s) {
		rollNo = s.rollNo;
		name = s.name;
	}

	public void getStudnetInfo() {
		System.out.println("Roll no: " + rollNo + " Name: " + name);
	}
}