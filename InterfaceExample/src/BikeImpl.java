
public class BikeImpl implements Bike, Bike2 {

	@Override
	public void tire() {
		System.out.println("tire");
	}

	@Override
	public void engine() {
		System.out.println("engine");
	}

	@Override
	public int getNum(int value) {
		return value;
	}

	@Override
	public void hello(String word) {
		word = word.toUpperCase();
		System.out.println(word);
	}

	@Override
	public void petrolTank() {
		System.out.println("petrol tank");
	}

	@Override
	public void welcome() {
		System.out.println("welcome");
	}
}
