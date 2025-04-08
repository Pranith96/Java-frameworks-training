
public class Example5 {

	public static void main(String[] args) throws DataNotFoundCompileTimeException {
		int age = 17;

		validateAge(age);

		System.out.println("Age is " + age);
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	private static void validateAge(int age) throws DataNotFoundCompileTimeException {
		if (age < 18) {
			throw new DataNotFoundCompileTimeException("Age is lesser");
		}
	}
}
