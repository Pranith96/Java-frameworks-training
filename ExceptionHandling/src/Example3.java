public class Example3 {

	public static void main(String[] args) {
		try {
			String s = null;
			if (s != null) {
				s = s.toUpperCase();
			}
			System.out.println(s);
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("in finally");
		}

		System.out.println("hello");
		System.out.println("world");
	}
}
