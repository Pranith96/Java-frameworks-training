
public class MainMethod {

	public static void main(String[] args) {
		ThreadExample th1 = new ThreadExample();
		th1.start();
		ThreadExample th2 = new ThreadExample();
		th2.start();
	}
}
