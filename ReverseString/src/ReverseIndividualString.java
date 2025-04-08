public class ReverseIndividualString {

	// i/p: Hello World --> o/p: olleH dlroW
	public static void main(String[] args) {
		String s = "Hello World";
		String[] str = s.split("\\s");
		for (int i = 0; i < str.length; i++) {
			String ss = str[i];
			for (int j = ss.length() - 1; j >= 0; j--) {
				System.out.print(ss.charAt(j));
			}
			System.out.println();
		}
		
		StringBuilder s1 = new StringBuilder("Hello World");
		s1.reverse();
		System.out.println(s1);
	}

}
