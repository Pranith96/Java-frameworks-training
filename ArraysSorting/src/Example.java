import java.util.Arrays;

public class Example {

	// code for Sorting with inbuilt method
	// print largest and 2nd largest number
	// print smallest number
	public void sortElements1() {
		int a[] = { 1, 4, 3, 2, 6, 5, 7, 8, 9, 0, 10, 11, 45, 12, 23 };
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		int smallestNumber = a[0];
		System.out.println(smallestNumber);

		int largestNumber = a[a.length - 1];
		System.out.println(largestNumber);

		int secondLargestNumber = a[a.length - 2];
		System.out.println(secondLargestNumber);
	}

	// code for Sorting without method
	// print largest and 2nd largest number
	// print smallest number
	public void sortElements2() {
		int a[] = { 1, 4, 3, 2, 6, 5, 7, 8, 9, 0, 10, 11, 45, 12, 23 };
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(a));

		int smallestNumber = a[0];
		System.out.println(smallestNumber);

		int largestNumber = a[a.length - 1];
		System.out.println(largestNumber);

		int secondLargestNumber = a[a.length - 2];
		System.out.println(secondLargestNumber);
	}

	// largest number without sorting
	public void largestElements() {
		int a[] = { 1, 4, 3, 2, 6, 5, 7, 8, 9, 0, 10, 11, 45, 12, 23 };
		System.out.println(Arrays.toString(a));

		int max = a[0]; // 1, 4, 6, 7...., 11, 45
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
