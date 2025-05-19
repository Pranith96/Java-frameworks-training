import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example3 {

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

		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		System.out.println(list);

		// Integer = id
		// Student = current id student object
		Map<Integer, Student> map = new HashMap<>();

		for (Student s : list) {
			map.put(s.getId(), s);
		}

		System.out.println(map);
	}
}
