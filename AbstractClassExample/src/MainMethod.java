
public class MainMethod {

	public static void main(String[] args) {
		MotorBike2 b = new MotorBike2();
		b.engine();
		b.petrolTank();
		b.hello("HELLO WORLD");
		b.tire();
		int result = b.getNum(10);
		System.out.println(result);
	}
}
