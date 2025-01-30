
public class WhileLoopExample {

	public void print10Num() {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
	}

	public void print10EvenNum() {
		int i = 0;
		while (i < 10) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public void print10OddNum() {
		int i = 0;
		while (i < 10) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
