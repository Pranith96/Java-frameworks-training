import java.util.HashMap;
import java.util.Map;

public class Example1 {

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

		Map<Student, Integer> map = new HashMap<>();
		map.put(s1, 1);
		map.put(s2, 2);
		map.put(s3, 3);
		map.put(s4, 2);
		map.put(null, 1);
		map.put(s1, 6);
		map.put(s3, 4);


		System.out.println(map);

		for (Map.Entry<Student, Integer> m : map.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}
}
