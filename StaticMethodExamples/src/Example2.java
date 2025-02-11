
public class Example2 {

	//static with return type and without parameters
	public static int display() {
		int i = 10;
		int j = 20;
		int k = i + j;
		return k;
	}

	//static with return type and with parameters
	public static int display_3(int i, int j) {
		int k = i + j;
		return k;
	}

	//static with return type and without parameters
	public static String display_1() {
		int i = 10;
		int j = 20;
		int k = i + j;
		System.out.println(k);
		String s = "Hello";
		return s;
	}

	//static with return type and with parameters
	public static boolean display_2(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}
}
