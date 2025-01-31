
public class Example {

	public void printNum() {

		for (int i = 0; i < 4; i++) { // rows
			System.out.println("i value: " +i); // 0,1, 2, 3,4
			
			for (int j = 0; j < 7; j++) { // columns
				System.out.println("j value: " + j); // 0-7
			}
		}
	}
	
//	[1,2,3,4,5] ==> [[1,2], [2,3] ,[3,4],[4,5]]
}
