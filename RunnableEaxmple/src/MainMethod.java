
public class MainMethod {

	public static void main(String[] args) {
		Example ex = new Example();
		Thread th1 = new Thread(ex);
		th1.start();
		
		Example ex1 = new Example();
		Thread th2 = new Thread(ex1);
		th2.start();
	}
}
