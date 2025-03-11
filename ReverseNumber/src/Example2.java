
public class Example2 {

	// sum of given number
	public static void main(String[] args) {
		int num = 1234; // 1+2+3+4 = 10
		int finalNum = 0;
		int rem;

		while (num > 0) {
			rem = num % 10; // 1234%10 = 4, 123%10 == 3, 12%10 = 2, 1%10 = 0.1
			finalNum = finalNum + rem; // 0+4 = 4, 4+3 = 7, 7+2 = 9, 9 + 1 = 10
			num = num / 10;// 1234/10 = 123, 123/10 ==> 12, 12/10 = 1, 1/10 = 0.1
		}
		System.out.println(finalNum); // 10 ==> 1+0 1
	}
}
