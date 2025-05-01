import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

//		List<Integer> list = new ArrayList<>();
//		List<String> list1 = new ArrayList<>();
//		List<Long> list2 = new ArrayList<>();
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

		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);

		System.out.println(studentList);

		for (Student st : studentList) {
			System.out.println(st);
		}
		System.out.println("............");
		Student ss = studentList.get(0);
		System.out.println(ss);

		Integer age = studentList.get(1).getAge();
		System.out.println(age);
		System.out.println("............");

		List<Student> activeList = new ArrayList<>();
		List<Student> inActiveList = new ArrayList<>();

		for (Student st : studentList) {
//			if (st.getStatus().equals("ACTIVE")) { // st.getStatus = null
//				System.out.println(st);
//			}

			if ("ACTIVE".equals(st.getStatus())) {
				// System.out.println(st);
				activeList.add(st);
			} else if ("InACTIVE".equals(st.getStatus())) {
				inActiveList.add(st);
			}
		}
		System.out.println(activeList);
		System.out.println(inActiveList);

		// Add student with age greater than 20 to new list
		// Add stuents with name ABC to new list
		// create list of number and extract only even numbers to new list
	}
}
