
public class MainClass {

	public static void main(String[] args) {
		Example1 ex = new Example1();
		ex.bike();
		int num = 10;
		ex.display(num);
		int a = 20;
		int b = 20;
		int c = 20;
		ex.display_1(a, b, c);
		String s = "Hello world";
		ex.display_2(30, s, 1000L);
		System.out.println("...................");
		ex.display_even(20);
	}
}
