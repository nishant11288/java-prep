package practice06;

public class Calculation {

	public void fact(int n) {

		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial is: " + fact);

	}
}
