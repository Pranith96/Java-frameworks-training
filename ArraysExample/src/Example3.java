import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		int[] i = { 12, 15, 2, 1, 44, 10, 11, 12, 13, 14, 15 };

		int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;

		System.out.println(Arrays.toString(arr));

		int[] arr1 = new int[25];

		for (int j = 0; j < arr1.length; j++) {
			arr1[j] = j; // arr1[0] = 0; arr1[1] = 1; arr1[2] = 2;....arr1[24] =24
		}
		
		System.out.println(Arrays.toString(arr1));
	}
}
