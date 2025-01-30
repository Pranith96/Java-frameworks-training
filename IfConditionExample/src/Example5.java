import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		// age <5 ==> baby
		// age == 5-12 ==> kid
		// age == 13-19 ==> teenager
		// age 20-35 ==> boy
		// age 36-60 ==> men
		// age 61-100 == old
		// age >100 -- invalid
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		if (age < 5) {
			System.out.println("Baby");
		} else if (age >= 5 && age <= 12) {
			System.out.println("Kid");
		} else if (age >= 13 && age <= 19) {
			System.out.println("Teenager");
		} else if (age >= 20 && age <= 35) {
			System.out.println("Young");
		} else if (age >= 36 && age <= 60) {
			System.out.println("Men");
		} else if (age >= 61 && age <= 100) {
			System.out.println("old");
		} else {
			System.out.println("Invalid age");
		}
		
		sc.close();
	}
}
