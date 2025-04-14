
public class Example extends Thread {

	@Override
	public void run() {
		printData();
	}

	private static void printData() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
