import java.util.HashMap;
import java.util.Map;

public class MainMethod {

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
		
		
		Map<Integer, Student> map = new HashMap<>();
		map.put(1, s1);
		map.put(3, s2);
		map.put(2, s3);
		map.put(4, s4);
		map.put(null, s1);
		map.put(5, null);
		
		System.out.println(map);
		
		for(Map.Entry<Integer, Student> m : map.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}
}
