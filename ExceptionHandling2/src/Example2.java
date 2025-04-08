
public class Example2 {

	public static void main(String[] args) throws Exception {
		int age = 17;

		validateAge(age);

		System.out.println("Age is " + age);
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	private static void validateAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception("Age is lesser");
		}
	}
}
