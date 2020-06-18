package practice21;


public class Student {
	
	void m(Student obj){
		System.out.println("print a");
	}
	
	void f(){
		m(this);
	}
	
	public static void main(String args[]){
		Student a1 = new Student();
		a1.f();
	}

}
