
public class College {

	private int collegeId;
	private String collegeName;
	private String collegeCode;

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeCode() {
		return collegeCode;
	}

	public void setCollegeCode(String collegeCode) {
		this.collegeCode = collegeCode;
	}

	public College(int collegeId, String collegeName, String collegeCode) {
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeCode = collegeCode;
	}

	public College() {
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeCode=" + collegeCode
				+ "]";
	}

}
