import java.util.HashSet;
import java.util.Set;

public class Example {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>(); // LinkedHashSet, TreeSet
		set.add(3);
		set.add(4);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		System.out.println(set);

		Set<String> set1 = new HashSet<>();
		set1.add("Anv");
		set1.add("efr");
		set1.add("fssd");
		set1.add("Anv");
		set1.add("efr");
		set1.add("fssd");
		set1.add("Anv");
		set1.add("efr");
		set1.add("fssd");

		for (String s : set1) {
			System.out.println(s);
		}

		System.out.println(set1);

		Integer size = set.size();
		System.out.println(size);
		boolean b = set.isEmpty(); // !list.isEmpty();
		System.out.println(b);
		boolean b3 = set.contains(4);
		System.out.println(b3);

		set.remove(0);
		System.out.println(set);
		System.out.println(set);

//		for(int i = 0; i<a.length;i++) {
//			a[i];
//		}

		System.out.println(".............");
		int index = 0;
		for (Integer val : set) {
			System.out.println(val);
			index++;
		}
	}
}
