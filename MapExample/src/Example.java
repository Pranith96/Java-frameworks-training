import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>(); // LinkedHashMap, TreeMap, ConcurrentHashMap
		map.put(1, "ABC");
		map.put(4, "XYZ");
		map.put(2, "asa");
		map.put(3, "XYZ");
		map.put(2, "PQR");
		map.put(null, "JKL");
		map.put(5, null);
		map.put(2, "dfgh");

		System.out.println(map);

		String res = map.get(3);
		System.out.println(res);

		boolean res1 = map.containsKey(9);
		System.out.println(res1);

		boolean res2 = map.containsValue("XYZ");
		System.out.println(res2);

		System.out.println(map.size());
		System.out.println(map.isEmpty());

		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			map.remove(2);
		}

		Set<Integer> s = map.keySet();
		System.out.println(s);

		Collection<String> l = map.values();
		System.out.println(l);
	}
}
