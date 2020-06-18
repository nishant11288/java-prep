package practice09;

public class Student {

	int rollNo;
	String name;
	float marks;

	Student(int r, String n) {
		rollNo = r;
		name = n;
	}

	Student(int r, float m) {
		rollNo = r;
		marks = m;
	}

	Student(int r, String n, float m) {
		rollNo = r;
		name = n;
		marks = m;
	}

	public void getStudentInfo() {
		System.out.println("Roll No: " + rollNo + " Name: " + name + " marks: " + marks);
	}
}