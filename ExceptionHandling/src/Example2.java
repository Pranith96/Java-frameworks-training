import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		try {
			int a[] = new int[3];
			a[0] = 1;
			a[1] = 2;
			a[2] = 3;
			a[3] = 4;
			System.out.println(Arrays.toString(a));
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}

		System.out.println("hello");
		System.out.println("world");
	}
}
