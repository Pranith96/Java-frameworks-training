import java.util.Arrays;

public class Example4 {

	public static void main(String[] args) {
		try {

			int a1 = 10;
			int b = 2;
			int c = a1 / b; // 10/0
			System.out.println(c);

			int a[] = new int[3];
			a[0] = 1;
			a[1] = 2;
			a[2] = 3;
			a[3] = 4;
			System.out.println(Arrays.toString(a));

			String s = null;
			s = s.toUpperCase();
			System.out.println(s);
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("in finally");
		}

		System.out.println("hello");
		System.out.println("world");
	}
}