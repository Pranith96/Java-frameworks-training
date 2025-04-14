
public class Example {

	public static synchronized void printData(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(i);
		}
		System.out.println("Hello");
	}
}
