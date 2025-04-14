
public class ThreadExample extends Thread {

	@Override
	public void run() {
		Example.printData(5);
	}
}
