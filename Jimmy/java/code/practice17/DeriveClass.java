package practice17;

public class DeriveClass {

	public static void main(String[] args) {

		Student_problem s1 = new Student_problem(111, "mohit");
		Student_problem s2 = new Student_problem(222, "goel");

		// output will be incorrect		
		s1.getStudentInfo();
		s2.getStudentInfo();
		
		
		
		Student_solution s3 = new Student_solution(111, "mohit");
		Student_solution s4 = new Student_solution(222, "goel");

		// output will be correct		
		s3.getStudentInfo();
		s4.getStudentInfo();

	}

}
