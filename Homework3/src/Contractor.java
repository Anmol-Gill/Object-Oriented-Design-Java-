public class Contractor extends Employee {

	private double basePay;

	public Contractor() {
		super();
	}

	public Contractor(String firstName, String lastName, Address address, double pay, int id) {
		super();
	}

	public double getBasePay() {
		return basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Base Pay ").append(this.basePay).append("\n");
		return sb.toString();
	}

	public void introduce(boolean displaySSN) {
		displaySSN = true;
		System.out.println("Name: " +getFirstName()+ " " + getLastName());
		System.out.println("Age: " + getAge());	
		System.out.println("Employee ID: " + getID());	
	}

	public double computePay(int numHrs) {
		return numHrs * basePay;
	}
}
