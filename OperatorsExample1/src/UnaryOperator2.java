
public class UnaryOperator2 {

	public static void main(String[] args) {
		int i = 10;
		int j = i++ + i++; // 10++    +    11++                    (10) + (10+1) ==> 21 ===> 11 + 11
		System.out.println(i); // (11+1) -->12
		System.out.println(j); //21

		int m = 10;
		int k = ++m + ++m; // (10+1) + (11+1) ==> 11+12 ===> 23
		System.out.println(m); // 12
		System.out.println(k); //23
	}
}
