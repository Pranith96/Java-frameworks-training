
public class Demo {
	
	int a = 100; // instance variable --> non static variable
	static int b = 50; // static variable

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.add();
		System.out.println(demo.a);
		System.out.println(b);
		div();
	}

	// non-static methods
	public void add() {
		int i = 10; // local variable
		System.out.println(i);
		int j = 20;
		int k = i + j;
		System.out.println(k);
		int m = k + i;
		System.out.println(m);
		
		System.out.println(a);
		System.out.println(b);
	}

	public void sum() {
		System.out.println(a);
		add();
		System.out.println(b);
	}
	
	//static method
	public static void div() {
		Demo d = new Demo();
		d.add();
		System.out.println(b);
	}
}
