
public class FullTimeHourly extends FullTimeEmployee {

	private double overtimePay;

	public FullTimeHourly() {
		super();
	}

	public FullTimeHourly(String firstName, String lastName, Address address, int id, double basePay, double overtime) {
		super();
	}

	public double getOvertimePay() {
		return overtimePay;
	}

	public void setOvertimePay(double overtimePay) {
		this.overtimePay = overtimePay;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Overtime pay: ").append(this.overtimePay).append("\n");
		return sb.toString();
	}

	public void introduce(boolean displaySSN) {
		if (displaySSN = true) {
			System.out.println("Name: " +getFirstName()+ " " + getLastName());
			System.out.println("Age: " + getAge());	
			System.out.println("Employee ID: " + this.getID() + " ");	
		}
	}

	public double computePay(int numHrs) {
		return numHrs * overtimePay + getBasePay();
	}
}