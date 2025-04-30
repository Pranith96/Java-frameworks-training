import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		// without auto boxing
		int i = 10;
		Integer i1 = new Integer(i);

		long l = 100L;
		Long l1 = new Long(l);

		boolean b = true;
		Boolean b1 = new Boolean(b);

		// with Autoboxing
		int i2 = 10;
		Integer i3 = i2;

		long l2 = 100L;
		Long l3 = l2;

		// Without unboxing
		Integer i4 = new Integer(10);
		int i5 = i4.intValue();

		Long l4 = new Long(100L);
		long l5 = l4.longValue();

		// With unboxing
		Integer i6 = new Integer(10);
		int i7 = i6;

		Long l6 = new Long(100L);
		long l7 = l6;
		
//		Student d1 = new Student();
//		Student d2 = new Student();
//		Student d3 = new Student();
//		Student[] s = new Student[3];
//		s[0] = d1;
//		s[1] = d2;
//		s[2] = d3;
//		Student[] s1 = {d1,d2,d3};
//		System.out.println(Arrays.toString(s));
	}
}
