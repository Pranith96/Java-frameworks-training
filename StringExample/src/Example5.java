import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {
		String s = "768 HELLO 123 welcome 897";
		String[] str = s.split("\\s");
		System.out.println(Arrays.toString(str));
	}
}
