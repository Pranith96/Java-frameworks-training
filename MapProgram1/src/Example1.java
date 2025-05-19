import java.util.LinkedHashMap;
import java.util.Map;

public class Example1 {

	public static void main(String[] args) {
		// print each character repeated times
		// Hello --> H = 1, e = 1, l = 2, o =1

		String s = "Hello world";
		s = s.replaceAll("\\s", ""); // to remove blank space
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			} else {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
		}

		System.out.println(map);

		// Remove duplicates from string

		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.print(m.getKey() + " ");
		}
		
	}
}
