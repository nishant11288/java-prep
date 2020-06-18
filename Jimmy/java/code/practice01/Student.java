package practice01;

public class Student {
	
	int id;
	String name;
	
	public static void main (String args[]){
		
		Student s1 = new Student();
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		s1.id = 10;
		s1.name = "mohit";
		
		System.out.println(s1.id);
		System.out.println(s1.name);
	}

}
