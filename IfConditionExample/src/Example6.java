
public class Example6 {

	public static void main(String[] args) {
		// vowels --> a,e,i,o,u
		// consonants --> other than vowels then print consonants

		char ch = 'u';

		switch (ch) {
		case 'a':
			// logic
			System.out.println("Vowels a");
			break;
		case 'e':
			// logic
			System.out.println("Vowels e");
			break;
		case 'i':
			/// logic
			System.out.println("Vowels i");
			break;
		case 'o':
			// logic
			System.out.println("Vowels o");
			break;
		case 'u':
			/// logic
			System.out.println("Vowels u");
			break;
		default:
			System.out.println("consonants");
			break;
		}
	}
}
