
public class PallidromeString {

	public static void main(String[] args) {
		String s = "MADAMK"; // MOM
		// isPallindrome(s);
		isPallindrome1(s);

	}

	public static void isPallindrome(String data) {
		String revString = "";
		for (int i = data.length() - 1; i >= 0; i--) {
			char ch = data.charAt(i);
			revString = revString + ch; // "" = "" +m , m = m+a, ma = ma+d , mad =mad+a, mada=mada+m, madam
		}

		if (data.equals(revString)) {
			System.out.println("is a pallindrome");
		} else {
			System.out.println("Not a pallindrome");
		}
	}

	// Two pointers logic
	public static void isPallindrome1(String data) {
		// MADAM
		int i = 0;
		int j = data.length() - 1;

		boolean isPallidrome = false;
		while (i < j) {
			if (data.charAt(i) == data.charAt(j)) {
				i++;
				j--;
				isPallidrome = true;
			} else {
				isPallidrome = false;
				break;
			}
		}

		if (isPallidrome) {
			System.out.println("is a Pallindrome");
		} else {
			System.out.println("not a pallindrome");
		}
	}
	
	//https://www.linkedin.com/pulse/exploring-two-sum-problem-two-pointer-approach-jean-claude-adjanohoun-xjn6c
}
