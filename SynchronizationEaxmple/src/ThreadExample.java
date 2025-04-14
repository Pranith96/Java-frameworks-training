
public class ThreadExample extends Thread {

	private Example ex;

	public ThreadExample(Example ex) {
		this.ex = ex;
	}

	@Override
	public void run() {
		ex.printData(5);
	}
}
