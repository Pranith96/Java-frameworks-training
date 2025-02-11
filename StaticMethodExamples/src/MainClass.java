
public class MainClass {

	public static void main(String[] args) {
		int result = Example2.display();
		System.out.println(result);

		String str = Example2.display_1();
		System.out.println(str);

		int num = 18;
		boolean b = Example2.display_2(num);
		System.out.println(b);

		int result1 = Example2.display_3(100, 200);
		System.out.println(result1);

		System.out.println(".........");

		Example1.bike();
		Example1.display(20);
		Example1.display_1(20, 20, 20);
		Example1.display_2(20, "Hello", 123456L);
		Example1.display_even(20);
	}
}
