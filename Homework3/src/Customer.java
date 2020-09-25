public class Customer extends Person {

	private int customerID;
	private String paymentPreference;

	public Customer() {
		super(null, null, null);
	}

	public Customer(String firstName, String lastName, Address address, int id) {
		super(firstName, lastName, address);
		this.customerID = id;
		this.getAddress();
	}

	public int getID() {
		return customerID;
	}

	public void setID(int customerID) {
		this.customerID = customerID;
	}

	public String getPayPreference() {
		return paymentPreference;
	}

	public void setPayPreference(String paymentPreference) {
		this.paymentPreference = paymentPreference;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Customer ID: ").append(this.customerID).append("\n");
		sb.append("Payment Preference: ").append(this.paymentPreference).append("\n");
		return sb.toString();
	}

	public void introduce() {
		System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
		System.out.println("Age: " + this.getAge());
		System.out.println("Address: " + this.getAddress());
	}

	public void makePayment() {
		System.out.println("Make payment in check/cash.");
	}

	public Address setAddress(int i, String string, String string2, String string3, String string4) {
		return getAddress();

	}
}
