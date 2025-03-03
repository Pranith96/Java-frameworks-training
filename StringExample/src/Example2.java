
public class Example2 {

	public static void main(String[] args) {
		String s = "HELLO";
		s = s.toLowerCase();
		System.out.println(s);

		String s1 = "Hello  ";
		int length = s1.length();
		System.out.println(length);

		String s2 = "  Hello ";
		System.out.println(s2);
		s2 = s2.trim();
		System.out.println(s2);
		
		char ch = s2.charAt(1);
		System.out.println(ch);
		
		boolean result = s2.startsWith("H");
		System.out.println(result);
		
		boolean result1 = s2.endsWith("o");
		System.out.println(result1);
		
		s2 = s2.concat("World");
		System.out.println(s2);
		boolean result3 = s2.contains("oWord");
		System.out.println(result3);
		
		
	}
}
