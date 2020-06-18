package practice11;

public class Student {

	int rollNo;
	String name;

	Student() {

	}

	Student(int r, String n) {
		rollNo = r;
		name = n;
	}

	public void getStudentInfo() {
		System.out.println("Roll no: " + rollNo + " name: " + name);
	}
}