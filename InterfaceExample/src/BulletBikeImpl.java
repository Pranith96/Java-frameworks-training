
public class BulletBikeImpl implements Bike {

	@Override
	public void tire() {
		System.out.println("Bullet bike tire");
	}

	@Override
	public void engine() {
		System.out.println("Bullet bike egine");

	}

	@Override
	public void petrolTank() {
		System.out.println("Bullet bike petrol tank");
	}

	@Override
	public void hello(String word) {
		System.out.println("Bullet bike" + word);
	}

	@Override
	public int getNum(int value) {
		return value;
	}

}
