import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		int[] i = { 12, 15, 2, 1, 44, 10, 11, 12, 13, 14, 15 };
		int[] j = { 10, 11, 12, 13, 14, 15, 16 };

		boolean b = Arrays.equals(i, j);
		System.out.println(b);

		System.out.println(Arrays.toString(i));
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));

		int result = Arrays.binarySearch(i, 10);
		System.out.println(result);

		for (int k = 0; k < i.length; k++) { // 0-
			System.out.println(i[k]); // i[0] = 1, i[1] = 2; i[3] = 10;...... 44
		}
	}
}