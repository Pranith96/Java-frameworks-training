public class Example2 {

	// swapping of 2 numbers
	public void swap() {

		int a = 10;
		int b = 20;
		System.out.println("Before swapping a:" + a + " b: " + b);
		// logic
		int temp = 0;
		temp = a; // temp = 10
		a = b; // a=20
		b = temp; // b = 10
		System.out.println("After swapping a:" + a + " b: " + b);
	}
}
