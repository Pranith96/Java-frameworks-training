
public class Example {

	public static void main(String[] args) {
		int i = 11;

		boolean result = (i % 2 == 0);
		System.out.println(result);
		// even number logic
		if (i % 2 == 0) { // 10%2 ==> 0
			int j = i + 20;
			System.out.println(j);
		}

		// odd number logic
		if (i % 2 != 0) { // 10%2 ==> 0
			System.out.println("Odd number");
		}
	}
}
