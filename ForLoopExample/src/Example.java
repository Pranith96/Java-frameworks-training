
public class Example {

	public static void main(String[] args) {
		Example m = new Example();
		m.printEvenNumUpto10();
		System.out.println("................");
		m.printTenNum();
		System.out.println("................");
		ForloopExample fr = new ForloopExample();
		fr.print5Num();
		System.out.println("................");
		fr.printOddNumUpto10();
	}

	public void printTenNum() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	public void printEvenNumUpto10() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
