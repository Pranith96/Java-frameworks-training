
public class Example1 {
	// non-static
	// without return type and without paramaters
	public void bike() {
		System.out.println("bike");
	}

	// without return type and with single parameter
	public void display(int num) {
		System.out.println(num);
	}

	// without return type and with multiple parameters
	public void display_1(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println(result);
	}

	// without return type and with multiple parameters
	public void display_2(int num1, String word, long value) {
		System.out.println(num1);
		System.out.println(word);
		System.out.println(value);
	}

	// without return type and with single parameter
	public void display_even(int num) {
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
