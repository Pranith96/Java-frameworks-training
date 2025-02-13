
public class TerinaryOparatorExample {

	public static void main(String[] args) {
		int a = 10;
		boolean result = (a > 5) ? true : false;
		System.out.println(result);

		String result1 = (a < 5) ? "Hello" : "Hi";
		System.out.println(result1);

		String result2 = (a < 5) ? add() : sum();
		System.out.println(result2);
	}

	public static String sum() {
		String s = "Sum";
		return s;
	}

	public static String add() {
		return "ADD";
	}
}
