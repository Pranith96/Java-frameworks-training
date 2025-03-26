
public class Address {

	private int plotNo;
	private String city;
	private String streetName;
	private String state;

	public int getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Address(int plotNo, String city, String streetName, String state) {
		this.plotNo = plotNo;
		this.city = city;
		this.streetName = streetName;
		this.state = state;
	}

	public Address() {
	}

	@Override
	public String toString() {
		return "Address [plotNo=" + plotNo + ", city=" + city + ", streetName=" + streetName + ", state=" + state + "]";
	}
}
