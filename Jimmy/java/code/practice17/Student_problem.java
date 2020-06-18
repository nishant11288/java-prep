package practice17;

public class Student_problem {

	int rollNo;
	String name;

	Student_problem(int rollNo, String name) {
		// parameter names are same
		rollNo = rollNo;
		name = name;
	}

	public void getStudentInfo() {
		System.out.println("Roll no: " + rollNo + " name: " + name);
	}

}
