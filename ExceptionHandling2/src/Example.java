
public class Example {

	public static void main(String[] args) {
		int age = 17;

		if (age < 18) {
			throw new RuntimeException("Age is lesser");
		}

		System.out.println("Age is " + age);
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
