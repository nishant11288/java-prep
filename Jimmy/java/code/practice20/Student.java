package practice20;

public class Student {

	int rollNo;
	String name;
	float fees;

	Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	Student(int rollNo, String name, float fees) {
		this(rollNo, name);
		this.fees = fees;
	}

	public void getStudentInfo() {
		System.out.println("Roll no: " + rollNo + " name: " + name + " fees: " + fees);
	}

}
