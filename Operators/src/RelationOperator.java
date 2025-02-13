
public class RelationOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 50;
		boolean result = a < b; // 10<20 = true;
		System.out.println(result);

		boolean result1 = c > b; // 50> 20 = true;
		System.out.println(result1);

		boolean result2 = a > b; // 10 > 20 = false;
		System.out.println(result2);

		boolean result3 = (a == b);
		System.out.println(result3);

		boolean result4 = a != b;
		System.out.println(result4);

		boolean result5 = (a <= b);
		System.out.println(result5);
		boolean result6 = (a >= b);
		System.out.println(result6);

	}
}
