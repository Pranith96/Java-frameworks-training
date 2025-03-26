
public class Student {

	private int id;

	private String name;

	private int age;

	private String status;

	private Address address;

	private College college;

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", status=" + status + ", address=" + address
				+ ", college=" + college + "]";
	}

	public Student() {

	}

	public Student(int id, String name, int age, String status) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.status = status;
	}

	public Student(int id, String name, int age, String status, Address address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.status = status;
		this.address = address;
	}
}
