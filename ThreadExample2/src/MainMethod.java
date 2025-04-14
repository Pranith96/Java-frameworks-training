
public class MainMethod {

	public static void main(String[] args) throws InterruptedException {
		Example ex = new Example();
		ex.start();
		//ex.setName("th1");
		//ex.setPriority(0);
		ex.join();
		
		Example ex1 = new Example();
		ex1.start();
		//ex1.setName("th2");

	}
}
