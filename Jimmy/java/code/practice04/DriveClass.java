package practice04;

public class DriveClass {

	public static void main(String[] args) {

		Temple t1 = new Temple();
		Temple t2 = new Temple();

		t1.insertInfo("Thakur darbar", "Vrindavan", 108);
		t2.insertInfo("Mata Mansa Devi", "Chandigarh", 101);

		t1.displayInfo();
		t2.displayInfo();

	}

}
