
public class Example4 {

	public static void main(String[] args) {
		int age = 17;

		validateAge(age);

		System.out.println("Age is " + age);
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	private static void validateAge(int age) {
		if (age < 18) {
			throw new DataNotFoundRuntimeException("Age is lesser");
		}
	}
}
