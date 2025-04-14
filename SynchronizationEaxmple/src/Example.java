
public class Example {

//	public synchronized void printData(int num) {
//		for (int i = 0; i < num; i++) {
//			System.out.println(i);
//		}
//	}

	public void printData(int num) {
		synchronized (this) {
			for (int i = 0; i < num; i++) {
				System.out.println(i);
			}
		}
		System.out.println("Hello");
	}
}
