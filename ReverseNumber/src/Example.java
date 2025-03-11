
public class Example {

	// Reverse a number
	public static void main(String[] args) {
		int num = 1234;
		int revNum = 0;
		int rem;

		while (num > 0) {
			rem = num % 10; // 1234%10 = 4, 123%10 == 3, 12%10 = 2, 1%10 = 0.1
			revNum = (revNum * 10) + rem; // 4, 40+3 ==> 43, 430 + 2 = 432, 4320 + 1 = 4321
			num = num / 10;// 1234/10 = 123, 123/10 ==> 12, 12/10 = 1, 1/10 = 0.1
		}

		System.out.println(revNum);
	}
}
