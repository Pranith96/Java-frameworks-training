import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int num = sc.nextInt();
		System.out.println("you entered:");
		System.out.println(num);
		String s = sc.next(); // 20, 30
		System.out.println(s);

		// String s1 = sc.nextLine();

		sc.close();
	}
}
