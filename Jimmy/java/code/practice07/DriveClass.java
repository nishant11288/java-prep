package practice07;

public class DriveClass {

	public static void main(String[] args) {

		Account acc = new Account();

		acc.createAccount("mohit goel", 123, 10000);

		acc.addBalance(50000);

		acc.withdrawBalance(1000);

	}

}
