
public class Example3 {

	public static void main(String[] args) {
		int age = 30;

		if (age < 18) {
			System.out.println("age is less than 18");
		} else if ((age < 25) && (age >= 18)) { // 18-25
			System.out.println("hello");
			System.out.println("java");
		} else {
			System.out.println("age is more");
		}
	}
}
