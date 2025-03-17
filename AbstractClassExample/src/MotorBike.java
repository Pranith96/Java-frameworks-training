
public abstract class MotorBike extends Bike {

	@Override
	public void tire() {
		System.out.println("Inside motor Bike tire");
	}

	@Override
	public void petrolTank() {
		System.out.println("inside motor bike petrol tank");
	}

	public abstract void hello(String word);

	@Override
	public int getNum(int value) {
		return value;
	}

}
