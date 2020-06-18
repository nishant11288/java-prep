package practice14;

public class Counter {

	int normalCount = 0;
	static int staticCount = 0;

	Counter() {
		normalCount++;
		staticCount++;

		System.out.println("Normal count: " + normalCount + " Static count: " + staticCount);
	}
}