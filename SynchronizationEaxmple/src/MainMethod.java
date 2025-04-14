
public class MainMethod {

	public static void main(String[] args) {
		Example ex = new Example();
		ThreadExample th1 = new ThreadExample(ex);
		th1.start();
		ThreadExample th2 = new ThreadExample(ex);
		th2.start();
	}
}
