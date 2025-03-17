
public class MainMethod {

	public static void main(String[] args) {
		BikeImpl b = new BikeImpl();
		b.engine();
		b.tire();
		b.petrolTank();
		int result = b.getNum(20);
		System.out.println(result);
		b.hello("hello");
		System.out.println("..............");

		BulletBikeImpl b1 = new BulletBikeImpl();
		b1.engine();
		b1.tire();
		b1.petrolTank();
		int result1 = b1.getNum(20);
		System.out.println(result1);
		b1.hello("welcome");
		System.out.println("..............");
		Bike bike = new BulletBikeImpl();
		bike.engine();
		bike.tire();
		bike.petrolTank();
		int result2 = bike.getNum(20);
		System.out.println(result2);
		bike.hello("indian bike ");
	}
}
