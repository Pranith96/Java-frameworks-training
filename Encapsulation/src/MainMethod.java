
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

		Address ad = new Address();
		ad.setCity("HYD");
		ad.setPlotNo(12);
		ad.setState("TS");
		ad.setStreetName("HJKL");
		System.out.println(ad);

		College cl = new College();
		cl.setCollegeCode("CLK");
		cl.setCollegeId(1);
		cl.setCollegeName("LKJH");

		System.out.println(cl);

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("XYZ");
		s2.setAge(20);
		s2.setStatus("ACTIVE");
		s2.setAddress(ad);
		s2.setCollege(cl);

		System.out.println(s2);

		// Address : id, plotNo, city, state, pincode, country
		// College: collegeId, name, collegeCode,.....

		Student s3 = new Student(3, "PQR", 23, "ACTIVE");
		s3.setAddress(ad);
		s3.setCollege(cl);
		System.out.println(s3);

		Address ad3 = s3.getAddress();
		System.out.println(ad3);
		String s = ad3.getState();
		System.out.println(s);
		
		String state = s3.getAddress().getState();
		System.out.println(state);
	}
}
