
public class MainMethod {

	public static void main(String[] args) {
		Addition ad = new Addition(); // compiletime polymorphism
		ad.add(20, 10);
		ad.sub(20, 10);
		ad.mul(20, 10);
		ad.div(20, 10);
		ad.hello();
		
		Calculator cl = new Addition(); // runtime polymorphism
		cl.add(20, 10);
		cl.sub(20, 10);
		cl.mul(20, 10);
		cl.div(20, 10);
		//cl.hello();
	}
}
