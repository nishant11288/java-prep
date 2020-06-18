package practice16;

public class Student {
	
	int rollNo;
	String name;
	
	static String collegeName = "IET";
	
	Student(int r, String n){
		rollNo = r;
		name = n;
	}
	
	public void getStudentInfo(){
		System.out.println("Roll no: "+ rollNo + " name: "+name + " college: "+collegeName);
	}
	
	
	static public void updateCollege(){
		collegeName = "RIMT";		
	}

}
