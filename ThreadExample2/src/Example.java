
public class Example extends Thread {

	@Override
	public void run() {
		printData();
	}

	private static void printData() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName());
	}
}
