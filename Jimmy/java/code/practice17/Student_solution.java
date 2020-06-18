package practice17;

public class Student_solution {

	int rollNo;
	String name;

	Student_solution(int rollNo, String name) {
		
		this.rollNo = rollNo;
		this.name = name;
	}

	public void getStudentInfo() {
		System.out.println("Roll no: " + rollNo + " name: " + name);
	}}
