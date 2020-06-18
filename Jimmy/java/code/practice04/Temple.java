package practice04;

public class Temple {

	String name;
	String location;
	int pincode;

	public void insertInfo(String n, String l, int p) {
		name = n;
		location = l;
		pincode = p;
	}

	public void displayInfo() {
		System.out.println("Temple named: " + name + " is at location: " + location + " having pincode: " + pincode);
	}
}
