import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Example4 {

	public static void main(String[] args) {

		String s = "Hello world Hello Hello World1 Welcome";
		String[] str = s.split("\\s");
		System.out.println(Arrays.toString(str));
		Map<String, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < str.length; i++) {
			if (!map.containsKey(str[i])) {
				map.put(str[i], 1);
			} else {
				map.put(str[i], map.get(str[i]) + 1);
			}
		}

		print1stUniqueCharacter(map);
		System.out.println("...........");
		print1stRepeatedCharacter(map);

	}

	private static void print1stRepeatedCharacter(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if (m.getValue() > 1) {
				System.out.println(m.getKey());
				break;
			}
		}
	}

	// First unique word or non-repeated word Hello World --> Hello
	public static void print1stUniqueCharacter(Map<String, Integer> map) {
		System.out.println(map);

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if (m.getValue() == 1) {
				System.out.println(m.getKey());
				break;
			}
		}
	}
}
