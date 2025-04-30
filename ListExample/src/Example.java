import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Example {

	public static void main(String[] args) {

//		int[] a = new int[4];
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		a[3] = 4;// ArrayIndexOutBoudException

//		int res = a[3];
		List<Integer> list = new ArrayList<>(); // LinkedList, Vector, // Double
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);

		List<String> list1 = new ArrayList<>();
		list1.add("Anv");
		list1.add("efr");
		list1.add("fssd");

		for (String s : list1) {
			System.out.println(s);
		}

		System.out.println(list1);

		Integer result = list.get(0);
		System.out.println(result);
		Integer size = list.size();
		System.out.println(size);
		boolean b = list.isEmpty(); // !list.isEmpty();
		System.out.println(b);
		boolean b3 = list.contains(4);
		System.out.println(b3);

		list.remove(0);
		System.out.println(list);
		list.set(3, 10);
		System.out.println(list);

//		for(int i = 0; i<a.length;i++) {
//			a[i];
//		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(".............");
		int index = 0;
		for (Integer val : list) {
			System.out.println(val);
			index++;
		}
	}
}
