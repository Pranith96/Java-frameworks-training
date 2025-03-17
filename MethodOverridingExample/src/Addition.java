
public class Addition extends Calculator {

	public void add(int a, int b) {
//		int c = a + b;
//		System.out.println(c);
		super.add(a, b);
		System.out.println("hi world");
	}

	public void hello() {
		System.out.println("Hello");
	}
	
	
	public void mul(int a, int b) {
		super.mul(a, b);
		System.out.println("java");
	}

}
