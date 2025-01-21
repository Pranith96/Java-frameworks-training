// class name
public class Example {

	// main method
	public static void main(String[] args) {
		System.out.println("Hello world...!!"); // print statement
		System.out.println(10);

		Example ex = new Example(); // Object creation
		ex.display(); // method calls
		ex.hi(); // method calls
	}

	// void method name display
	public void display() {
		System.out.println("Welcome to java");
		
		Example ex1 = new Example();
		ex1.hi();
	}

	// void method name hi
	public void hi() {
		System.out.println("Welcome to Springboot");
	}
}
