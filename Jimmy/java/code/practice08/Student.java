package practice08;

public class Student {
	int rollNo;
	String name;

	Student(int r, String n) {
		rollNo = r;
		name = n;
	}

	public void getStudentInfo() {
		System.out.println("Name: " + name + " Roll no: " + rollNo);
	}
}