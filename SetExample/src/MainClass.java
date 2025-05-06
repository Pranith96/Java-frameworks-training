import java.util.HashSet;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setId(1);
		s1.setAge(20);
		s1.setName("ABC");
		s1.setStatus("ACTIVE");

		Student s2 = new Student();
		s2.setId(2);
		s2.setAge(22);
		s2.setName("XYZ");
		s2.setStatus("ACTIVE");

		Student s3 = new Student();
		s3.setId(3);
		s3.setAge(25);
		s3.setName("XYZ");
		s3.setStatus("ACTIVE");

		Student s4 = new Student();
		s4.setId(4);
		s4.setAge(29);
		s4.setName("PQR");
		s4.setStatus("InACTIVE");

		Student s5 = new Student();
		s5.setId(5);
		s5.setAge(18);
		s5.setName("ABC");
		
		Student s6 = new Student();
		s6.setId(4);
		s6.setAge(25);
		s6.setName("PQR");
		s6.setStatus("ACTIVE");

		Student s7 = new Student();
		s7.setId(5);
		s7.setAge(18);
		s7.setName("LKJD");

		Set<Student> studentList = new HashSet<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);


		System.out.println(studentList);

//		for (Student st : studentList) {
//			System.out.println(st);
//		}
//		System.out.println("............");
		

//
//		List<Student> activeList = new ArrayList<>();
//		List<Student> inActiveList = new ArrayList<>();
//
//		for (Student st : studentList) {
////			if (st.getStatus().equals("ACTIVE")) { // st.getStatus = null
////				System.out.println(st);
////			}
//
//			if ("ACTIVE".equals(st.getStatus())) {
//				// System.out.println(st);
//				activeList.add(st);
//			} else if ("InACTIVE".equals(st.getStatus())) {
//				inActiveList.add(st);
//			}
//		}
//		System.out.println(activeList);
//		System.out.println(inActiveList);

		// Add student with age greater than 20 to new list
		// Add stuents with name ABC to new list
		// create list of number and extract only even numbers to new list
	}
}
