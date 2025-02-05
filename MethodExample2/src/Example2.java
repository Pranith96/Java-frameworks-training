
public class Example2 {

	// Non-static with return type and without parameters

	public int display() {
		int i = 10;
		int j = 20;
		int k = i + j;
		return k;
	}

	// Non-static with return type and with parameters
	public int display_3(int i, int j) {
		int k = i + j;
		return k;
	}

	// Non-static with return type and without parameters
	public String display_1() {
		int i = 10;
		int j = 20;
		int k = i + j;
		System.out.println(k);
		String s = "Hello";
		return s;
	}

	// Non-static with return type and with parameters
	public boolean display_2(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}
}
