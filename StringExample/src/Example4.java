
public class Example4 {

	public static void main(String[] args) {
		String s = "768 HELLO 123 welcome 897";
		s = s.replaceAll("[^0-9]", "");
		System.out.println(s);

		String s1 = "768 HELLO 123 welcome 897";
		s1 = s1.replaceAll("[^a-zA-Z]", "");
		System.out.println(s1);

		String s2 = "768 HELLO 123 welcome 897";
		s2 = s2.replaceAll("[^a-z0-9]", "");
		System.out.println(s2);

		String s4 = "@*768 HELLO 123 welcome& 897";
		System.out.println(s4);
		s4 = s4.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s4);
	}
}
