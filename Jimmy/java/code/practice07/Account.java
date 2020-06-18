package practice07;

public class Account {

	String name;
	int accountNumber;
	float amount;

	public void createAccount(String n, int ac, float am) {
		name = n;
		accountNumber = ac;
		amount = am;
		System.out.println("Account open.");
		getAccountDetails();
	}

	public void getAccountDetails() {
		System.out.println("Name: " + name + " account number: " + accountNumber + " amount: " + amount);
	}

	public void addBalance(float am) {
		amount = amount + am;
		System.out.println("Amount added: " + am);
		getAccountDetails();
	}

	public void withdrawBalance(float am) {
		if (amount < am) {
			System.out.println("low balance");
		} else {
			amount = amount - am;
			System.out.println("money withdrwan: " + am);
		}

		getAccountDetails();

	}

}
