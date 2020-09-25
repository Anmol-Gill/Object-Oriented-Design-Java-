
public class Address {

	private int streetNum;
	private String streetName;
	private String city;
	private String zip;
	private String state;
	
	public Address(int streetNum, String streetName, String city, String zip, String state) {
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.zip = zip;
		this.state = state;	
	}
	
	public int getStreetNum() {
		return streetNum;
	}
	
	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}
	public String getStreetName() {
		return streetName;
	}
	
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getZip() {
		return zip;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}

}
