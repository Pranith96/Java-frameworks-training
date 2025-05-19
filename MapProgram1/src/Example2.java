import java.util.LinkedHashMap;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {

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

		print1stUniqueCharacter(map);
		System.out.println("...........");
		print1stRepeatedCharacter(map);


	}

	private static void print1stRepeatedCharacter(Map<Character, Integer> map) {
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			if(m.getValue() > 1) {
				System.out.println(m.getKey());
				break;
			}
		}
	}

	// First unique character or non-repeated character Hello World --> H
	public static void print1stUniqueCharacter(Map<Character, Integer> map) {
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			if(m.getValue() == 1) {
				System.out.println(m.getKey());
				break;
			}
		}
	}
}
