
public class MainClass {

	public static void main(String[] args) {
		Example2 ex = new Example2();
		int result = ex.display();
		System.out.println(result);
		
		String str = ex.display_1();
		System.out.println(str);

		int num = 18;
		boolean b = ex.display_2(num);
		System.out.println(b);
		
		int result1 = ex.display_3(100,200);
		System.out.println(result1);
	}
}
