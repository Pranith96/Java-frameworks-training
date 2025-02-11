import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		int[] i = { 12, 15, 2, 1, 44, 10, 11, 12, 13, 14, 15 };
		String[] str = { "abs", "789", "dfsdv", "@#", "dsfd" };
		char[] ch = { 'a', 'e', 'i', 'o', 'u' };

		System.out.println(Arrays.toString(i));
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(ch));

		int data = i[2];
		System.out.println(data);
		String s = str[2];
		System.out.println(s);

		char c = ch[4];
		System.out.println(c);

		int size1 = i.length;
		System.out.println(size1);
		int size2 = str.length;
		System.out.println(size2);

	}
}
