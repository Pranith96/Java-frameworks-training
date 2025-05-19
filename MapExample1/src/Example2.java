import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("ABC");
		s1.setAge(23);
		s1.setStatus("ACTIVE");

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("XYZ");
		s2.setAge(20);
		s2.setStatus("ACTIVE");

		Student s3 = new Student();
		s3.setId(3);
		s3.setName("PQR");
		s3.setAge(23);
		s3.setStatus("InACTIVE");

		Student s4 = new Student();
		s4.setId(4);
		s4.setName("jk");
		s4.setAge(22);
		s4.setStatus("InACTIVE");

		List<Student> list1 = new ArrayList<>();
		list1.add(s1);
		list1.add(s2);

		List<Student> list2 = new ArrayList<>();
		list2.add(s3);
		list2.add(s4);

		Map<Integer, List<Student>> map = new HashMap<>();
		map.put(1, list1);
		map.put(2, null);
		map.put(4, list2);
		map.put(3, list1);

		System.out.println(map);

		for (Map.Entry<Integer, List<Student>> m : map.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}
}
