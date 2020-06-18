package practice03;

public class DriveClass {
	
	public static void main(String args[]){
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.empid = 101;
		e1.name = "mohit";
		
		e2.empid = 102;
		e2.name = "goel";
		
		System.out.println("Employee with id: "+ e1.empid + " have name: "+ e1.name);
		System.out.println("Employee with id: "+ e2.empid + " have name: "+ e2.name);
	}

}
