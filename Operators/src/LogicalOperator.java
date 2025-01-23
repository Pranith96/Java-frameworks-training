
public class LogicalOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		boolean result = (a < b) && (b < c) && (c < a); // true && true && false === false
		System.out.println(result);
		
		boolean result1 = (a < b) && (b < c) && (c > a); // true && true && true === true
		System.out.println(result1);
		
		boolean result5 = (a < b) && (b < c) && !(c > a); // true && true && false === false
		System.out.println(result5);
		
		boolean result2 = (a < b) || (b < c) || (c > a); // true || true || true === true
		System.out.println(result2);
		
		boolean result3 = (a < b) || (b < c) || (c < a); // true || true || false === true
		System.out.println(result3);
	}
}
