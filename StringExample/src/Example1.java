
public class Example1 {

	public static void main(String[] args) {
		String s = "Hello";// String constant pool
		String s1 = "Hello";
		String s2 = new String("Hello"); // Heap memory
		String s3 = new String("Hello");

		if (s == s1) { // reference memory
			System.out.println("True....1");
		}

		if (s2 == s3) {
			System.out.println("True.....2");
		}

		if (s == s2) { // Memory reference
			System.out.println("True....3");
		}

		if (s.equals(s2)) {
			System.out.println("True....4");
		}

		if (s2.equals(s3)) { // Data
			System.out.println("True....5");
		}
	}
}
