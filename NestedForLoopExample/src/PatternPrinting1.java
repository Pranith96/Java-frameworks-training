
public class PatternPrinting1 {

//	* * * *  i = 0 --> j full
//	* * *	 i = 1 --> j full -1
//	* *      i = 2 --> j full -2
//	*        i = 3 --> j full - 3

	// Vishwa
	public void pattern1() {
		for (int i = 0; i < 4; i++) { // 0, 1, 2, 3
			for (int j = i; j < 4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void pattern2() {
		for (int i = 0; i < 4; i++) { // 0, 1, 2
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
