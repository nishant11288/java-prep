package practice02;

public class DriveClass {
	
	public static void main(String args[]){
		
		Student s1 = new Student();
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		s1.id  = 100;
		s1.name = "goel";
		
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
	
	
}
