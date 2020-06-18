package practice18;

public class Student {

	Student() {
		System.out.println("in default constructor");
	}

	Student(int x) {
		this();
		System.out.println("parameterised constructor, X is: " + x);
	}
}