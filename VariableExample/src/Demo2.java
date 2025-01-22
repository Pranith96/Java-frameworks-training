
public class Demo2 {

	int a = 100; // instance variable --> non static variable
	static int b = 50; // static variable

	public static void main(String[] args) {
		Demo2 demo = new Demo2();
		System.out.println(demo.a); // 100

		System.out.println(b); // 50

		demo.add();
		System.out.println(demo.a); // 30
		div();
		System.out.println(b); // 40
	}

	// non-static methods
	public void add() {
		int i = 20;
		int j = 40;
		a = i + j;
	}

	// static method
	public static void div() {
		b = 40;
	}
}
