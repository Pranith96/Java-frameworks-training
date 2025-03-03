
public class Example3 {

	public static void main(String[] args) {
		String s = "HELLO 123 welcome";
		String s2 = "Hello welcome 456";

		String str = s.substring(3);
		System.out.println(str);

		String str1 = s.substring(6);
		System.out.println(str1);

		String st2 = s.substring(0, 5);
		System.out.println(st2);

		String st3 = s.substring(6, 9);
		System.out.println(st3);

		String s4 = s2.substring(s2.length() - 3, s2.length());
		System.out.println(s4);
	}
}
