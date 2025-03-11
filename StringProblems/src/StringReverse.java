
public class StringReverse {

	// convert reverse string and make upper case
	public static void main(String[] args) {
		String s = "Hello welcome";

		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			s1 = s1 + ch; // "" = "" +e , e = e+m, em = em+o, emo=emo+c.....
		}

		System.out.println(s1.toUpperCase());
	}
}
