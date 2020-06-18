package practice19;

public class Student {
	
	Student(){
		this(111);
		System.out.println("print a");
	}
	
	Student(int rollNo){
		System.out.println("roll no is: "+rollNo);
	}

}
