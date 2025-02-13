
public class UnaryOperator3 {

	public static void main(String[] args) {
		int i = 10;
		int j = i-- + i--; // 10 + 9 = 19
		System.out.println(i); // (9-1) -->8
		System.out.println(j); // 19

		int m = 10;
		int k = --m + --m; // (10-1) + (9-1) ==> 9+8 ===> 17
		System.out.println(m); // 8
		System.out.println(k); // 17
	}
}
