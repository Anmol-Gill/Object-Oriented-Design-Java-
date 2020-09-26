public class PartTimeHourly extends Employee {

	private double baseHourlyPay;

	public PartTimeHourly() {
		super();
	}

	public PartTimeHourly(String firstName, String lastName, Address address, double pay) {
		super();
	}

	public double getHourlyPay() {
		return baseHourlyPay;
	}

	public void setHourlyPay(double baseHourlyPay) {
		this.baseHourlyPay = baseHourlyPay;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hourly pay: ").append(this.baseHourlyPay).append("\n");
		return sb.toString();
	}

	public void introduce(boolean displaySSN) {
		displaySSN = true;
		System.out.println("Name: " +getFirstName()+ " " + getLastName());
		System.out.println("Age: " + getAge());	
		System.out.println("Employee ID: " + this.getID() + " ");	
	}

	public double computePay(int numHrs) {
		return numHrs * baseHourlyPay;
	}
}
