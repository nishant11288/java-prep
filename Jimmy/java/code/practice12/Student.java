package practice12;

public class Student {

	int rollNo;
	String name;
	static String collegeName = "RIMT";

	Student(int r, String n) {
		rollNo = r;
		name = n;
	}

	public void getStudentInfo() {
		System.out.println("Roll no: " + rollNo + " name: " + name + " College: " + collegeName);
	}
}