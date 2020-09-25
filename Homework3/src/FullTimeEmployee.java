public abstract class FullTimeEmployee extends Employee {

	private double basePay;

	public FullTimeEmployee() {
		super();
	}

	public FullTimeEmployee(String firstName, String lastName, Address address, int id, double basePay) {
		super();
	}

	public double getBasePay() {
		return basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}
}
