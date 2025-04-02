
public class Example {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a / b; // 10/0
			System.out.println(c);
		} catch(ArithmeticException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("hello");
		System.out.println("world");
	}
}
