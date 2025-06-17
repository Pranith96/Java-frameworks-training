
public class Demo {

	public static void main(String[] args) {
		
		Addition ad = new AdditionImpl();
		int rs = ad.add(2, 10);
		System.out.println(rs);
	}
}
