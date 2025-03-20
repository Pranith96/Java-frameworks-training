
public class MainMethod {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("ABC");
		s1.setAge(15);
		s1.setStatus("ACTIVE");

		int id = s1.getId();
		System.out.println(id);

		String name = s1.getName();
		System.out.println(name);

		int age = s1.getAge();
		System.out.println(age);

		String status = s1.getStatus();
		System.out.println(status);

		System.out.println(s1);

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("XYZ");
		s2.setAge(20);
		s2.setStatus("ACTIVE");

		System.out.println(s2);

		// Address : id, plotNo, city, state, pincode, country
		// College: collegeId, name, collegeCode,.....

	}
}
